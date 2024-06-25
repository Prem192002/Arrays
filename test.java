import java.util.*;

class test {
    static int lastIndex(int arr[], int st, int end,int target)
    {
        // {1,3,5,5,67,123,125}

        //code to find the last index
        int mid= (st+end)/2;
        int lastindex = arr.length-1;
        while(st<=end){
            
            if(arr[mid]==target){
                if(arr[mid+1]<=target){
                    lastindex=mid;
                    st=mid+1;
                    mid=(st+end)/2;
                }

                if(arr[mid]>target){
                    end=mid-1;
                    mid=(st+end)/2;
                }
            }

            if(arr[mid]>target){
                end=mid-1;
            }

            if(arr[mid]<target){
                st=mid+1;
            }
        }

        return lastindex+1;
        

    }
    

    public static void main(String[] args) {
        int arr1[] = {1,3,5,5,67,123,125};
        
        int res = lastIndex(arr1, 0, 6, 5);
        System.out.println(res);
   
    }
}
