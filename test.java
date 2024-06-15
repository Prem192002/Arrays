class test{
    //0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24


    static int sRoot(int num){
        int st = 0;
        int end=num;
        int ans = 0;
        while(st<=end){
            int mid=(st+end)/2;

            if(mid*mid==num){
                ans= mid;
                return ans;
            }
            if(mid*mid>num){
                end = mid-1;
            }

            if(mid*mid < num){
                ans=mid;
                st=mid+1;
            }
        }
        return ans;
    }
    public static void main(String args[]){
        System.out.println(sRoot(36));
    }
}