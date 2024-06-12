import java.util.*;
class test{

     static boolean binarysearch(int[] n,int st,int end, int target)
    {
       
        int mid=(st+end)/2;
        if(st>end){
            return false;
        }

        
        
        if(n[mid]==target){
            return true;
        }

        else if(target<n[mid]){
                
               return binarysearch(n, st, mid-1, target);
            }

        else{
                return binarysearch(n, mid+1, end, target);
            }
        }
        
        public static void main(String[] args) {
        int[] arr = {2,4,8,3,9,1,6};
        Arrays.sort(arr);
         boolean ans = binarysearch(arr,0,6,9);
        System.out.println(ans);
    }
}
