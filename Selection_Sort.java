public class Selection_Sort {
    static void sort(int [] arr){
        //[5,3,2,1,4,9,7]
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int minValue_index = i;
            for(int j=i;j<n;j++){
                if(arr[j]<arr[minValue_index]){
                    minValue_index=j;

                }
            }
            int temp=arr[i];
            arr[i]=arr[minValue_index];
            arr[minValue_index]=temp;
            
        }
    }

    public static void main(String[] args) {
        int[] arr={5,3,2,1,4,9,7};
        sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }

    }
}
