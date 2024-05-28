class test {
    static int series_number(int n) {
        if(n==0){
            return 1;
        }
        int num = series_number(n-1);
        int ans = n*num;
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(series_number(5));
    }
}
