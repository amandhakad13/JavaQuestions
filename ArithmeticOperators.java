import java.util.Scanner;

public class ArithmeticOperators {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num1,num2,sum;
            System.out.print("Enter first value : ");
            num1 = sc.nextInt();
            System.out.print("Enter second value : ");
            num2 = sc.nextInt();
            sum = num1 + num2;
            System.out.println("Addition of two number is : "+sum);
            System.out.println("Subtraction of two number is : "+(num1-num2));
            System.out.println("Multiplication of two number is : "+num1*num2);
            System.out.println("Division of two number is : "+num1/num2);
            System.out.println("Modulus of two number is : "+num1%num2);
        }
    }
}
