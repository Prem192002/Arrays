// You are using Java
import java.util.*;

class arr1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int x=sc.nextInt();
        
        int[] grades = new int[x];
        for(int i=0;i<x;i++){
            grades[i] = sc.nextInt();
            
        }
        for(int i=0;i<x;i++){
            if (grades[i]>=0){
                System.out.println(grades[i]);
            }
            
        }
        
    }
}