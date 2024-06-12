import java.util.*;

public class Binary_search {
    static int bsearch(int[] arr, int target){
        Arrays.sort(arr);
        int st=0;
        int end=arr.length-1;
        

        while(st<=end){
            int mid = (st+end)/2;
        if(arr[mid]==target){
            return mid;
        }
        else if(target>arr[mid]){
            st=mid+1;
        }
        else if(target<mid){
            end=mid-1;

        }
        }

        return -1;
    }

    public static void main(String args[]){
        int[] arr = {2,5,7,3,1,9,8};
        int ans = bsearch(arr, 9);
        System.out.println(ans);
    }
}
