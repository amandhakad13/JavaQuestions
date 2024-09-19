
import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, remainder, reverse = 0;

        System.err.print("Enter a number : ");
        n = sc.nextInt();

        while(n != 0) {
            remainder = n % 10;
            reverse = reverse * 10 + remainder;
            n = n / 10;
        }

        System.err.println("Reverse of a number are : "+reverse);
    }
}