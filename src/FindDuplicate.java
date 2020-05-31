public class FindDuplicate {

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

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 4};

        System.out.println("Duplicate element is " + hashing(A));
    }
}
