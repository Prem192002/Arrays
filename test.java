import java.util.Arrays;

class test
{
    //Function to find the maximum number of activities that can
    //be performed by a single person.
    public static int function(int k, int[] arr){
        int st=0;
        int end=arr.length-1;
        int gap1=arr.length;
        int gap2=arr.length;
        int value1=0;
        int value2=0;
        int ans =0;
        while(st<=end){
            int mid = (st+end)/2;

            if(arr[mid]<k){
                int count1 = k-arr[mid];
                gap1=count1;
                value1=arr[mid];

                st=mid+1;
            }

            if(arr[mid]>k){
                int count2=arr[mid]-k;
                gap2 = count2;
                value2=arr[mid];
                end=mid-1;
            }
        }
        if(gap1==gap2){
            ans=value2;
        }
        else if(gap1<gap2){
            ans=value1;
        }
        else if(gap1>gap2){
            ans=value2;
        }

        return ans;
    }

    
    public static void main(String[] args) {
        int[] arr = {1,5,6,6,8,10,10,10,13};
        
        
        int ans = function(11,arr);
        System.out.println(ans);
    }
}