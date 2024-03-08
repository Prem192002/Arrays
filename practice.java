import java.util.*;

class practice{
    public static void main(String[] args){
        int result = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the N value");
        int[] num = new int[5];
        for(int i=0;i<num.length;i++){
            num[i]=sc.nextInt();
        }
        for(int i=0;i<num.length;i++){
            result=result+num[i];
        }
        System.out.println(result);
    }
}