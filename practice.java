class details{
    public void ages(){
        int[][] ages = {{1,2,3},{4,5,6},{7,8,9}};
        // ages[0][0]=15;
        // ages[0][1]=25;
        // ages[1][0]=30;
        // ages[1][1]=45;
        // ages[0][0]=23;

        for (int i=0;i<2;i++){
            for (int j=0; j<2;j++){
                System.out.println(ages[i][j]);
            }
            
        }
        
    } 
}

public class practice {
    public static void main(String[] args){
        details obj1 = new details();
        obj1.ages();
    }
    
}
