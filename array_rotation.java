import java.util.*;

class array_rotation {

    public static void printarray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array1 = new int[5];
        array1[0] = 2;
        array1[1] = 4;
        array1[2] = 6;
        array1[3] = 8;
        array1[4] = 3;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of positions to rotate:");
        int k = sc.nextInt();

        int[] ans = new int[5];

        // Rotate the array elements
        for (int i = 0; i < 5; i++) {
            ans[(i + k) % 5] = array1[i];
        }

        System.out.println("Rotated array:");
        printarray(ans);
    }
}
