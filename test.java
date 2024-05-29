class test {
    static void k_multiples(int num, int k) {
        if(k==1){
            System.out.println(num);
            return;
        }
        k_multiples(num, k-1);

        System.out.println(num*k);
    }

    public static void main(String[] args) {
        k_multiples(3, 5);
        
    }
}
