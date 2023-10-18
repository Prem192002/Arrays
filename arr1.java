// You are using Java
import java.util.*;
class arr1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            
            int [] arr = new int[n];
            
            for (int i = 0; i<n; i++){
                arr[i] = sc.nextInt();
                
            }
            
            int expectedSum = (n+1)*(n+2)/2;
            int actualSum = 0;
            
            for (int num : arr){
                actualSum += num;
            }
            
            int missingElement = expectedSum - actualSum;
            System.out.println(missingElement);
        }
    }
