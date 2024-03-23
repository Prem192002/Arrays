class test {

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {

        // Your code here
        long[] arr1=new long[n];
        arr1[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            arr1[i]=arr1[i-1]+arr[i];
        }

        long[] arr2=new long[n];
        arr2[n-1]=arr[n-1];
        for(int i=n-2;i<arr.length;i--){
            if(i>=0){
            arr2[i]=arr2[i+1]+arr[i];
            }
            else break;
        }

        for(int i=0;i<arr.length;i++){
            if(arr1[i]==arr2[i]){
                return i+1;
            }
        }
        
        return -1;
        
    }

    public static void main(String[] args){
        long[] arr = {1};
        int result = equilibriumPoint(arr, 1);
        System.out.println(result);
    }
}