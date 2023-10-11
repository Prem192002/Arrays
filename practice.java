class details{
    public void ages(){
        int[] ages = {1,5,3,};

        int sum=0;
        for (int i=0;i<ages.length;i++){
            
                sum=sum+ages[i];
            }
            System.out.println(sum);
            
            
        }
        
        
     
}

public class practice {
    public static void main(String[] args){
        details obj1 = new details();
        obj1.ages();
    }
    
}
