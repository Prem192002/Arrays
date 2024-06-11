import java.util.*;

class array_rotation {

    public static void printarray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array1 = {4,8,3,1,9,7};
        
        

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of positions to rotate:");
        int k = sc.nextInt();

        int[] ans = new int[6];

        for (int i = 0; i < 6; i++) {
            ans[(i - k + 6) % 6] = array1[i];
        }

        System.out.println("Rotated array:");
        printarray(ans);
        }
}
