import java.util.Scanner;

public class AdditionTwoNumber {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            int num1,num2,sum;
            System.out.print("Enter the first value : ");
            num1 = input.nextInt();
            System.out.print("Enter the second value : ");
            num2 = input.nextInt();
            sum = num1 + num2;
            System.out.println("Sum of two number is : "+sum);
        }
    }
}