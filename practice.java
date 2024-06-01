import java.util.*;

class practice {
    // Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n) {
        return leader(arr, n, 0);
    }
    
    private static ArrayList<Integer> leader(int arr[], int n, int idx) {
        ArrayList<Integer> result = new ArrayList<>();
        
        // Base case
        if (idx == n - 1) {
            result.add(arr[n - 1]);
            return result;
        }
        
        //recursion work
        ArrayList<Integer> restLeaders = new ArrayList<>();
        restLeaders.addAll(leader(arr, n, idx + 1));
        
        // self work
        if (arr[idx] >= restLeaders.get(0)) {
            result.add(arr[idx]);
        }
        
        // Add the rest of the leaders to the result
        result.addAll(restLeaders);
        
        return result;
    }
    public static void main(String[] args) {
        int arr[] = {16, 17, 4, 3, 5, 2};
        int n = arr.length;

        ArrayList<Integer> leaders = practice.leaders(arr, n);
        for (int leader : leaders) {
            System.out.println(leader);
        }
    }
}

    

    