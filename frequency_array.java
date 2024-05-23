import java.util.*;
public class frequency_array{
    public static void main(String[] args){
        int[] array = new int[7];
        array[0]=4;
        array[1]=6;
        array[2]=5;
        array[3]=400;
        array[4]=720;

        int[] frequency = new int[100000];
        for(int i=0;i<frequency.length;i++ ){
            frequency[i]=0;
        }

        for(int j=0;j<array.length;j++){
            frequency[array[j]]++;
        }
        int[] num={7,5,1000,6,80};

        for(int i=0;i<5;i++){
            if(frequency[num[i]]>0){
                System.out.println(num[i]+" "+"= yes");
            }
            else{
                System.out.println(num[i]+" "+"= no");
            }
        }
    }
}
