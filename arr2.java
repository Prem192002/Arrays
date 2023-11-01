    import java.util.*;
public class arr2 {



    public static void main(String[] args){

        int[] array=new int[7];
        array[0]=1;
        array[1]=2;
        array[2]=3;
        array[3]=4;
        array[4]=7;
        array[5]=2;
        array[6]=1;

        int notunique=0; 
        
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]==array[j]){
                    notunique++;
                }
                // else if(array[i]!=array[j]){
                //     unique++;
                // }
            }
        }
        int unique=array.length-(2*notunique);
        System.out.println(unique);
    
}
}
