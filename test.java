import java.util.*;
class test{

    static int findPair(int n, int x, int[] arr) {
        // code here
        Arrays.sort(arr);
        int ans= -1;
        for(int i=0;i<arr.length;i++){
            int st=i+1;
            int end=arr.length-1;
            
            while(st<=end){
                int target = x+arr[i];
                int mid=(st+end)/2;
                if(arr[mid]>target){
                    end=mid-1;
                }

                else if(arr[mid]<target){
                    st=mid+1;
                }

                else if(arr[mid]==target){
                    ans= 1;
                    return ans;
                }
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {5, 20, 3, 2, 5, 80};
        int ans= findPair(6,78,arr);
        System.out.println(ans);
    }
}