import java.util.*;
class test{

    public static boolean isLucky(int n)
    {
        int counter=2;
        // Your code here
        if (counter > n) {
            return true;
        }
        // If n is divisible by counter, n is not a lucky number
        if (n % counter == 0) {
            return false;
        }
        // Calculate the new position of n after eliminating every counter-th number
        n = n - (n / counter);
        // Recursive call with the next counter
        return isLucky(n);
         
    }
    public static void main(String[] args) {
        boolean ans = isLucky(19);
        System.out.println(ans);
    }
}
