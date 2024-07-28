import java.util.*;

class test {
    static int lastIndex(int arr[], int target)
    {
        // {1,3,5,5,67,123,125}

        //code to find the last index

        int st=0;
        int end=arr.length-1;
        int res=-1;
        while(st<=end){
            int mid=(st+end)/2;
            if(arr[mid]==target){
                res=mid;
                st=mid+1;
            }

            if(arr[mid]>target){
                end=mid-1;
            }

            if(arr[mid]<target){
                st=mid+1;
            }
        }

        return res;
        

    }
    

    public static void main(String[] args) {
        int arr1[] = {1,3,5,67,123,125};
        
        int res = lastIndex(arr1, 5);
        System.out.println(res);
   
    }
}
