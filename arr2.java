import java.util.*;
class arr2 {
    public int minimizeSet(int divisor1, int divisor2, int uniqueCnt1, int uniqueCnt2) {
        int[] array1 = new int[uniqueCnt1];
        int initialize = 1;

        for (int a = 0; a < array1.length;) {
            if (initialize % divisor1 != 0) {
                array1[a] = initialize;
                initialize++;
                a++;
            } else {
                initialize++;
            }
        }

        int initialize2 = 1;
        int[] array2 = new int[uniqueCnt2];
        for (int a = 0; a < array2.length;) {
            if (initialize2 % divisor2 != 0 && !contains(array1, initialize2)) {
                array2[a] = initialize2;
                initialize2++;
                a++;
            } else {
                initialize2++;
            }
        }

        int[] res = merge(array1, array2);
        return res[res.length - 1];
    }

    private boolean contains(int[] arr, int num) {
        boolean result = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                result = true;
                break;
            }
        }
        return result;
    }

    private int[] merge(int[] num1, int[] num2) {
        int[] result = new int[num1.length + num2.length];
        int carry = 0;
        for (int i = 0; i < result.length; i++) {
            if (i < num1.length) {
                result[i] = num1[i];
            } else if (i - num1.length < num2.length) {
                result[i] = num2[carry];
                carry++;
            }
        }
        Arrays.sort(result);
        return result;
    }
     

    public static void main(String[] args) {
        int divisor1 = 12;
        int unicnt1 = 2;
        int divisor2 = 3;
        int unicnt2 = 10;
        arr2 sol = new arr2();
        int result = sol.minimizeSet(divisor1,divisor2,unicnt1,unicnt2); 
        System.out.println(result);       
    }
}
