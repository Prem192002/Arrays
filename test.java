import java.util.*;
class test {
    public static int print2largest(int arr[], int n) {
        // code here
        Arrays.sort(arr);
        int right=n-1;
        int result = 0;
        while (right>=0){
            if(right==0 && arr[right]==arr[right+1]){
                return -1;
            }
            else if (arr[right-1]!=arr[right]){
                result= arr[right-1];
                break;
            }

            else if(arr[right-1]==arr[right]){
                right--;
            }


            
            
        }
        return result;
        
    }
    public static void main(String[] args){
    int [] arr = {10,10,10,1};
    int fin= print2largest(arr,3);
    System.out.println(fin);
    }
}