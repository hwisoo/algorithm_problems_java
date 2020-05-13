import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZeroSum {

    public static void printAllSubarrays(int[] A) {
        for (int i = 0; i < A.length; i ++) {
            int sum = 0;

            for (int j = i; j < A.length; j++) {
                sum += A[j];

                if(sum == 0) {
                    System.out.println("Subarray [" + i + ".." + j + "]");

                }
            }
        }
    }


    // Utility function to insert <key, value> into the Multimap
    private static<K,V> void insert (Map<K, List<V>> hashMap, K key, V value) {
        if (!hashMap.containsKey(key)) {
            hashMap.put(key, new ArrayList<>());
        }

        hashMap.get(key).add(value);
    }

    public static void printAllSubarrays2(int[] A) {


        // create an empty Multi-map to store ending index of all sub-arrays having same sum
        Map<Integer, List<Integer>> hashMap = new HashMap<>();

        insert(hashMap, 0, -1);

        int sum = 0;

        // traverse the given array
        for (int i = 0; i < A.length; i++) {
            // sum of elements so far
            sum += A[i];

            // if sum is seen before, there exists at least one sub-array with 0 sum
            if (hashMap.containsKey(sum)) {
                List<Integer> list = hashMap.get(sum);

                for (Integer value: list) {
                    System.out.println("Subarray [" + (value + 1) + ".." + i + "]");
                }
            }

            // insert (sum so far, current index) pair into the multi-map
            insert(hashMap, sum, i);
        }
    }

    public static void main (String[] args) {
        int[] A = {3, 4, -7, 3, 1, 3, 1, -4, -2, -2};

//        printAllSubarrays(A);
        printAllSubarrays2(A);
    }
}
