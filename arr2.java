public class arr2 {
    public static void changearray(int[] arr){
        for(int i=0;i<arr.length;i++){
            arr[i]=0;
            System.out.print(arr[i]+" ");
        }

    }
    public static void main(String[] args){
        int[] array=new int[3];
        array[0]=5;
        array[1]=6;
        array[2]=7;

        changearray(array);
        
    }
    
}
