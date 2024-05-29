class test {
    static int power(int p, int q) {
        if(q==0){
            return 1;
        }
        int last_count = p;
        int reset_count= power(p,q-1);

        int ans = reset_count*last_count;
        return ans;
    }

    public static void main(String[] args) {
            System.out.println(power(6,3));
        
    }
}
