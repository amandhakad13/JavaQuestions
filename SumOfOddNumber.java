
import java.util.Scanner;

public class SumOfOddNumber {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);

        int n, add;

        System.out.print("Enter a value : ");
        n = sc.nextInt();

        add = oddNumberSum(n);
        System.out.println("Sum of odd number is : "+add);
    }

    public static int oddNumberSum(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            if(i % 2 != 0) {
                sum = sum + i;
            }
        }

        return sum; 
    }
}