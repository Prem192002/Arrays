class test {
    static int maxarray(int[]num, int idx) {
        if(idx==num.length-1){
            return num[idx];
        }
        int max = maxarray(num, idx+1);
        if(max>num[idx]){
            return max;
        }
        else{
            return num[idx];
        }
    }

    public static void main(String[] args) {
        int[] num = {5,8,2,7,12};
        System.out.println(maxarray(num, 0));
    }
}
