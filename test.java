class test {
    static int n_sum(int num) {
        if(num==1){
            
            return num;
        }
        int rest_sum=n_sum(num-1);
        int res = rest_sum+num;
        return res;
    }

    public static void main(String[] args) {
        System.out.println(n_sum(5));
        
    }
}
