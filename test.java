class fun{
    int sum_frn(int a,int b){
        int ans = a+b;
        return ans;
    }
}

class test{
    public static void main(String[] args) {
       
            fun obj = new fun();
            int ans = obj.sum_frn(5,3);
            System.out.println(ans);
        
    }
}