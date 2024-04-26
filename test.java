import java.lang.reflect.Array;
import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        ArrayList<Integer> li = new ArrayList<>();
        li.add(5);
        li.add(9);
        li.add(7);
        li.add(3);
        li.add(1);

        reverseArray(li);

        // Print the reversed arraylist
        for(int i=0;i<li.size();i++){
            System.out.print(li.get(i)+" ");
        }
        
    }

    public static void reverseArray(ArrayList<Integer> li) {
            int right = li.size()-1;
            int left = 0;

            while(right>left){
                int temp=li.get(left);
                li.set(left,li.get(right));
                li.set(right,temp);
                left++;
                right--;               
            }
        }
    }

