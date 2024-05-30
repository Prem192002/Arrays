class test {
    static void printarray(int[]num, int idx) {
        if(idx==num.length){
            return;
        }
        System.out.println(num[idx]);
        printarray(num, idx+1);
    }

    public static void main(String[] args) {
        int[] num = {5,8,2,7};
        printarray(num, 0);
    }
}
