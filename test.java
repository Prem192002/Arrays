class test {
    static int digit_count(int n) {
        if(n>=0 && n<=9){
            return n;
        }
        int last_count = 1;
        int reset_count= digit_count(n/10);

        int ans = reset_count+last_count;
        return ans;
    }

    public static void main(String[] args) {
            System.out.println(digit_count(1234589));
        
    }
}
