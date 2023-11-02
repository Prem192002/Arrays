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
        array1[4]=3;


        System.out.println("original array:");
        printarray(array1);
        int j=array1.length-1;
        for(int i=0;i<j;i++){
         
                int temp=array1[i];
                array1[i]=array1[j];
                array1[j]=temp;
                j=j-1;
            
        }
        
        for(int i=0;i<array1.length;i++){
            System.out.print(array1[i]+" ");
        }

    }
}