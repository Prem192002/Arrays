import java.util.ArrayList;
class test{
    public static void main(String[] args){
    ArrayList<Integer> l1 = new ArrayList<>();
    l1.add(5);
    l1.add(10);
    l1.add(15);
    l1.add(20);
    l1.add(25);

        
        boolean ans = l1.contains(20);
        System.out.println(ans);
    }
    
}