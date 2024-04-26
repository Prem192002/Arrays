import java.lang.reflect.Array;
import java.util.*;

public class test {
    public static void main(String[] args) {
        ArrayList<Integer> li = new ArrayList<>();
        li.add(5);
        li.add(9);
        li.add(7);
        li.add(3);
        li.add(1);

        Collections.sort(li);

        // Print the reversed arraylist
        for(int i=0;i<li.size();i++){
            System.out.print(li.get(i)+" ");
        }
        
    }
    }

