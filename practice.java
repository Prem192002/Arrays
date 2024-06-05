import java.util.*;
class practice{
    static int print2largest(int arr[], int n) {
        // code here
        
        ArrayList<Integer> sLargest = new ArrayList<>();
        Arrays.sort(arr);
        sLargest.add(arr[n-1]);
        for(int i=n-2;i>=0;i--){
            if(arr[i]<sLargest.get(0)){
                sLargest.add(arr[i]);
                break;
            }
        }
        if(sLargest.size()<=1){
            return -1;
        }else{
        return sLargest.get(1);
        }
        
    }
    
    public static void main(String args[]){
        int[] result = {10,10,10};
        System.out.println(print2largest(result, 3));
       
    }
}