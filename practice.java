import java.util.*;

class Solution {
    int missingNumber(int array[], int n) {
        int count =1;
        Arrays.sort(array);
        for(int i=0;i<array.length;i++){
            if(array[i]==count){
                count++;
            }
            else{
                return count;
            }
        }
        return count;
    }
}
class practice{

    public static void main(String[] args){
        int array[]={1,2,3,5};
        Solution sol = new Solution();
        int result = sol.missingNumber(array,5);
        System.out.println(result);
    }
}