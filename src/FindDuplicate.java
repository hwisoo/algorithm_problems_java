import java.util.stream.IntStream;

public class FindDuplicate {

    // Hashing solution
    public static int hashing(int[] A) {
        boolean visited[] = new boolean[A.length + 1];

        for (int value : A) {
            // if element is seen before
            if (visited[value]) {
                return value;
            }

            visited[value] = true;
        }

        // if no duplicates found
        return -1;
    }

    // Sum of all elements
    public static int sumOfElements(int[] A) {
        int actual_sum = IntStream.of(A).sum();
        int expected_sum = A.length * (A.length -1) / 2;
        
        return actual_sum - expected_sum;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 4};

//        System.out.println("Duplicate element is " + hashing(A));
        System.out.println("Duplicate element is " + sumOfElements(A));


    }
}
