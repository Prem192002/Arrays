import java.util.ArrayList;
import java.util.Collections;
class test{
    public static void main(String[] args){
    ArrayList<Integer> l1 = new ArrayList<>();
    l1.add(5);
    l1.add(10);
    l1.add(15);
    l1.add(20);
    l1.add(25);
    l1.add(50);
    l1.add(65);
    
    l1.add(4,100);
    Collections.sort(l1);
    System.out.println(l1);
    }
    
}