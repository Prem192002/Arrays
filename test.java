class test {
    static int hcd(int p, int q) {
        int smallest = 0;
        if(p>q){
            smallest=q;
        }
        else {
            smallest=p;
        }
        int res = 1;
        for(int i=1;i<=smallest;i++){
            if(p%i==0 && q%i==0){
                res=i;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(hcd(24,15));
        
    }
}
