class details{
    public void search(){
        int[] num = {1,5,25,3,10};
        int x=3;
        int ans=-1;
        for (int i=0;i<num.length;i++){
            if(x==num[i]){
                ans=i;
                break;
                
            }
        }
        if(ans==-1){
            System.out.println("not found");
        }else{
        System.out.println("found"+" "+x+" "+"at"+" "+ans);
        }
            
    }
}
           
     




public class practice {
    public static void main(String[] args){
        details obj1 = new details();
        obj1.search();
    }
    
}
