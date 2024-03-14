class test{
    public static void main(String[] args){
        int left = 0;
        int right =1;
        int sum = 0;
        int target = 12;
        int[] num = {1,2,3,7,5,9};
        while(left<num.length-1){
            sum=num[left]+num[right];
            right++;
            if(sum>target){
                left++;
            }
        }
    }
}