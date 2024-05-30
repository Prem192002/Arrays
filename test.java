class test {
    static boolean findx(int[]num,int x, int idx) {
        
        if(idx==num.length){
            return false;
        }
        
        if(num[idx]==x){
            return true;
        }

        return findx(num, x, idx+1);
        
        
    }

    public static void main(String[] args) {
        int[] num = {5,8,2,7,12};
        System.out.println(findx(num,12,0));
    }
}
