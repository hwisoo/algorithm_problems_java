import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Findpair {
    // Given an unsorted array of integers, find a pair with given sum in it.
    public static void findPair(int[] Arr, int sum) {

        // Nested loops - considers every pair in given array and return if desired sum is found.
//        System.out.println("Sum is " + sum);
//        for (int i = 0; i < Arr.length; i++) {
//            System.out.println("i is " + Arr[i]);
//            for (int j = i + 1; j <Arr.length; j++) {
//                System.out.println("j is " + Arr[j]);
//                if (Arr[i] + Arr[j] == sum) {
//                    System.out.println(Arr[i] + " + " + Arr[j] + " == " + sum);
//                    return;
//                }
//            }
//        }

//         No pair with given sum exists
//        System.out.println("Pair not found");

        // Solution using sorting - more efficient
//        Arrays.sort(Arr);
//         int low = 0;
//         int high = Arr.length -1;
//
//         while (low < high) {
//             if (Arr[low] + Arr[high] == sum) {
//                 System.out.println(Arr[low] + " + " + Arr[high] + " == " + sum);
//                 return;
//             }
//
//             if (Arr[low] + Arr[high] < sum) {
//                 low++;
//             } else {
//                 high--;
//             }
//         }
    //  No pair with given sum exists
//        System.out.println("Pair not found");


    // Solution using hashing - solves in linear time
    Map<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < Arr.length; i++) {
        if (map.containsKey(sum - Arr[i])) {
            System.out.println("Pair found at index " + map.get(sum - Arr[i]) + " and " + i);
            return;
        }

        map.put(Arr[i], i);
        System.out.println(map);
    }
    }

    // main function
    public static void main (String[] args) {
        int Arr[] = { 8, 7, 2, 5, 3, 1 };
        int sum = 10;
        findPair(Arr, sum);
    }
}
