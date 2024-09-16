import java.util.Scanner;

public class SwapTwoNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num1, num2, temp;
            System.out.print("Enter first value : ");
            num1 = sc.nextInt();
            System.out.print("Enter second value : ");
            num2 = sc.nextInt();
            temp = num1;
            num1 = num2;
            num2 = temp;
            System.out.println("After Swapping:");
            System.out.println("First value is : "+num1);
            System.out.println("Second value is : "+num2);
        }
    }
}
