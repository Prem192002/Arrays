import java.util.*;
public class arr1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the sizxe of the array");
        int x = sc.nextInt();

        System.out.println("wnter the array element:");

        int [] marks = new int[x];
        for(int i=0;i<x;i++){
        marks[i]=sc.nextInt();  //i=0-x;
        }
        
        for(int i=0;i<x;i++){
            System.out.print(+marks[i]);
        }
    

    
    }
}
