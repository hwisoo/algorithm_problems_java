public class Findpair {
    // Given an unsorted array of integers, find a pair with given sum in it.
    public static void findPair(int[] Arr, int sum) {

        // Nested loops - considers every pair in given array and return if desired sum is found.
        System.out.println("Sum is " + sum);
        for (int i = 0; i < Arr.length; i++) {
            System.out.println("i is " + Arr[i]);
            for (int j = i + 1; j <Arr.length; j++) {
                System.out.println("j is " + Arr[j]);
                if (Arr[i] + Arr[j] == sum) {
                    System.out.println(Arr[i] + " + " + Arr[j] + " == " + sum);
                    return;
                }
            }
        }
    }

    // main function
    public static void main (String[] args) {
        int Arr[] = { 8, 7, 2, 5, 3, 1 };
        int sum = 10;
        findPair(Arr, sum);
    }
}
