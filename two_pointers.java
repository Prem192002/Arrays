public class two_pointers {
    public static void main(String[] args) {
        int[] arr = {7, 2, 9, 4, 3, 5};
        
        int i=0;
        int j=arr.length-1;
        while(i<j) {
            if (arr[i] > arr[j]) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j--;
            } else {
                j --;
                if(i==j){
                    i++;
                    j=arr.length-1;
                }
            }
        }

        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
