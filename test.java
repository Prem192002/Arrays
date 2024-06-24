import java.util.*;

class test {
    public static ArrayList<Integer> countEleLessThanOrEqual(int arr1[], int arr2[]) {
        ArrayList<Integer> result = new ArrayList<>();

        Arrays.sort(arr2); // Sort arr2 for binary search

        for (int i = 0; i < arr1.length; i++) {
            int target = arr1[i];
            int left = 0;
            int right = arr2.length - 1;
            int count = 0;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (arr2[mid] <= target) {
                    count = mid + 1;
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            result.add(count);
        }

        return result;
    }

    public static void main(String[] args) {
        int arr1[] = {4, 8, 7, 5, 1};
        int arr2[] = {0, 1, 1, 3, 4, 5, 48};

        ArrayList<Integer> counts = countEleLessThanOrEqual(arr1, arr2);
        System.out.println("Counts: " + counts); // Output the counts
    }
}
