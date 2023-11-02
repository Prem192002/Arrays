import java.util.*;

public class arr2 {

    public static int count(int x) {
        int count = 0;
        while (x > 0) {
            x = x / 10;
            count = count + 1;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        int[] array = new int[count(num)];
        int countdigit=count(num);
        for (int j = 0; j < countdigit; j++) {
            array[j] = num % 10;
            num = num / 10;
        }

        System.out.print("Reversed digits: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }
}
