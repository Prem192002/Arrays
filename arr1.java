import java.util.*;
class details{
    static void fun(int num){
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[num];
        System.out.println("enter the array value:");
        for (int i=0;i<ages.length;i++){
        ages[i]=sc.nextInt();
        }
    for(int i=0;i<num;i++){
        System.out.print(ages[i]);
        }
    }
}
public class arr1{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array: ");
    int num = sc.nextInt();
        details obj = new details();
        obj.fun(num);
    }
}