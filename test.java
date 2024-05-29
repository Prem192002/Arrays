class test {
    static int fibonacci(int n) {
        if(n==0 || n==1){
            return n;
        }
        int first_prev = fibonacci(n-1);
        int second_prev = fibonacci(n-2);

        int ans = first_prev+second_prev;
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(7));
    }
}
