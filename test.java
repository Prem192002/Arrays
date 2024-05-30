class test {
    static int arraysum(int[]num, int idx) {
        if(idx==num.length-1){
            return num[idx];
        }
        int smallsum = arraysum(num, idx+1);
        int res = num[idx]+smallsum;
        return res;
    }

    public static void main(String[] args) {
        int[] num = {5,8,2,7,12};
        System.out.println(arraysum(num, 0));
    }
}
