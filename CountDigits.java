
import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, count = 0;

        System.err.print("Enter a number : ");
        n = sc.nextInt();

        while(n != 0) {
            count++;
            n = n / 10;
        }

        System.err.println("Total number of digits are : "+count);
    }
}