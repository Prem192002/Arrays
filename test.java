class test {
    static int digit_sum(int n) {
        if(n>=0 && n<=9){
            return n;
        }
        int last_digit = n%10;
        int reset_sum = digit_sum(n/10);

        int ans = reset_sum+last_digit;
        return ans;
    }

    public static void main(String[] args) {
            System.out.println(digit_sum(1234));
        
    }
}
