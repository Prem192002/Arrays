import java.util.*;

class practice {
    public static ArrayList<Integer> leaders(int arr[], int n, int idx){
        
        ArrayList<Integer> result = new ArrayList<>();
        //base case
        if(idx==n-1){
        result.add(arr[n-1]);
        return result;
        }
        //self work

        if(arr[idx]>arr[idx+1] && arr[idx]>arr[idx-1]){
            result.add(arr[idx]);
        }
        //regresion work
        result.addAll(leaders(arr, n, idx+1));

        return result;
    }
    

    public static void main(String[] args) {
        int arr[] = {16,17,4,3,5,2};
        int n = arr.length;
        for (int i = 0; i < leaders(arr,n,0).size(); i++) {
            System.out.println(leaders(arr,n,0).get(i));
        }
       
    }
}