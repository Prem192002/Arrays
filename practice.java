class details{
    public void maxarray(){
        int[] num = {1,5,25,3,10};

        int ans=0;
        for (int i=0;i<num.length;i++){
            if(num[i]>ans){
                ans=num[i];
            }
            }
            System.out.println("Max" + ans);
            
            
        }
        
        
     
}

public class practice {
    public static void main(String[] args){
        details obj1 = new details();
        obj1.maxarray();
    }
    
}
