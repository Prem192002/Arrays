import java.util.*;

class practice {
    public static ArrayList<Integer> duplicates(int arr[], int n){
        
        ArrayList<Integer> result = new ArrayList<>();
        Arrays.sort(arr);
        int left = 0;
        int right = left+1;
        while(right<arr.length){
            if(arr[left]!=arr[right]){
                right++;
                left ++;
            }
            else if(arr[left]==arr[right]){
                if(!result.contains(arr[right])){
                result.add(arr[right]);
                }
                right++;
                left++;
            }
        }
        if(result.size()==0){
            result.add(-1);
        }
        return result;
    }
    

    public static void main(String[] args) {
        int arr[] = {3, 4, 12, 3, 12, 3, 4, 4, 12, 7, 11, 6, 5,4};
        int n = arr.length;
        for (int i = 0; i < duplicates(arr,n).size(); i++) {
            System.out.println(duplicates(arr,n).get(i));
        }
       
    }
}