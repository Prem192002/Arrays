class practice{

    public static int equilibriumPoint(long arr[], int n) {
        long[] sum1 = prefixSum(arr);
        long[] sum2 = suffixSum(arr);
        int ans = -1;
        for(int i=0;i<arr.length;i++){
            if(sum1[i]==sum2[i]){
                ans = i+1;
            }

        }
        return ans;
        
    }

    private static long[] prefixSum(long[] arr){
        long[] num1 = new long[arr.length];
        num1[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            num1[i]=num1[i-1]+arr[i];
        }
        return num1;
    }

    private static long[] suffixSum(long[] arr){
        long[] num2 = new long[arr.length];
        num2[num2.length-1]=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            num2[i]=num2[i+1]+arr[i];
        }
        return num2;
    }
    public static void main(String args[]){
        long[] result = {1,3,5,2,2};
        System.out.println(equilibriumPoint(result, 5));
    }
}