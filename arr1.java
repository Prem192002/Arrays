import java.util.*;
class arr1{

    public static void printarray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] array1 = new int[5];
        array1[0]=2;
        array1[1]=4;
        array1[2]=6;
        array1[3]=8;
        array1[4]=10;

        // System.out.println("original array:");
        // printarray(array1);

        //int[] array2=Arrays.copyOfRange(array1,0,3);

        // System.out.println("Copied array:");
        // printarray(array2);


        System.out.println("original array:");
        printarray(array1);

        for(int i=array1.length-1;i>=0;i--){
            System.out.print(array1[i]+" ");
        }

    }
}