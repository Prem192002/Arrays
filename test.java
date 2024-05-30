class test {
    static int hcd(int p, int q) {
        if(q==0){
            return p;
        }
        return hcd(q,p%q);
    }

    public static void main(String[] args) {
        System.out.println(hcd(24,15));
        
    }
}
