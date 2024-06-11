public class Merge_Sort {
    public static void merge(int [] arr,int l, int mid, int h){
        int l1 = mid-l+1;
        int l2= h-mid;
        int[]leftarr = new int[l1];
        int[]rightarr = new int[l2];

        for (int i = 0; i < l1; i++) {
            leftarr[i] = arr[l+i];
        }
        for (int j = 0; j < l2; j++) {
            rightarr[j] = arr[mid + 1 + j];
        }

        int i=0;
        int j=0; 
        int k=l;

        while(i<l1 && j<l2){
            if(leftarr[i]<=rightarr[j]){
                arr[k]=leftarr[i];
                i++;
                k++;
            }
            else{
                arr[k]=rightarr[j];
                j++;
                k++;
            }
        }

        while(i<l1){
            arr[k]=leftarr[i];
            i++;
            k++;
        }

        while(j<l2){
            arr[k]=rightarr[j];
            j++;
            k++;
        }

        
    }
    
    public static void sort(int[] arr, int lower, int higher){
    //take the mid value of the array
        if(lower>=higher){
            return;
        }
        int mid = (higher+lower)/2;
        sort(arr,lower,mid);
        sort(arr,mid+1,higher);
        merge(arr, lower, mid, higher);
    }

    public static void main(String[] args) {
        int [] arr = {4,1,3,5,2,8,7};
        int n= arr.length;
        sort(arr, 0, n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }          
}
