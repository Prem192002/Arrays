class details{
    public void ages(){
        int[][] ages = {{1,2},{4,5},{7,8,9}};
        // ages[0][0]=15;
        // ages[0][1]=25;
        // ages[1][0]=30;
        // ages[1][1]=45;
        // ages[0][0]=23;

        for (int i=0;i<ages.length;i++){
            for (int j=0; j<ages[i].length;j++){
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
