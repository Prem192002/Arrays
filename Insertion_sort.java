/**
 * Insertion_sort
 */
public class Insertion_sort {
    static void sort(int[] arr){
        // [ 3 , 8 , 6 , 2 , 4 , 5 ]
        int n = arr.length;
        
            for(int j=1;j<n;j++){
                if(arr[j]<arr[j-1]){
                    for(int k=j;k>0;k--){
                    if(arr[k]<arr[k-1]){
                    int temp=arr[k-1];
                    arr[k-1] = arr[k];
                    arr[k]=temp;
                    }
                }
                }
            }
    }
    public static void main(String[] args) {
        int [] arr={3 , 8 , 6 , 2 , 4 , 5};
        sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}