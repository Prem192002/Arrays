import java.util.*;
class student{
    private int id;
    private String name;


    

    public int getID(){
        return id;
    }
    public void setID(int id){
        this.id=id;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
}


    public class arr1{
        public static void main(String[] args){
            Scanner sc= new Scanner(System.in);
            student obj = new student();
            System.out.println("enter the id:");
            obj.setID(sc.nextInt());
            System.out.println("enter the name:");
            sc.nextLine();
            obj.setName(sc.nextLine());
            System.out.println("the id is:"+obj.getID()+"the name is:"+obj.getName());
        }
    }


