class details{
    public void ages(){
        int[][] ages = new int[2][2];
        ages[0][0]=15;
        ages[0][1]=25;
        ages[1][0]=30;
        ages[1][1]=45;

        int f1 = ages[0][0];
        System.out.println(f1);
        // System.out.println(ages[1]);
        
    } 
}



public class practice {
    public static void main(String[] args){
        details obj1 = new details();
        obj1.ages();
    }
    
}
