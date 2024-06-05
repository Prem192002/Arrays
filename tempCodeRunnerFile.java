import java.util.*;
class test{
    // Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencyCount(int arr[], int N, int P) {
        // Step 1: Normalize elements greater than N to 0
        int[] num = new int[P+2];
        Arrays.sort(arr);
        if(N>=P){
        for(int i=0;i<N;i++){
            num[arr[i]]++;
        }
        
        }
        else if(N<P){
            for(int i=0;i<N;i++){
                num[arr[i]]++;
            }
        }

        
        
        for (int i = 0; i < N; i++) {
            arr[i] = num[i + 1];
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 3, 2, 3, 5};
        int N1 = arr1.length;
        int P1 = 5;
        frequencyCount(arr1, N1, P1);
        for (int i = 0; i < N1; i++) {
            System.out.print(arr1[i] + " ");
        }
        
    }
}