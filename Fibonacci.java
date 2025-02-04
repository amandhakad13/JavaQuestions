import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		
		sc.close();
		
		int a = 1, b = 1, f = 0;
		
		System.out.print(a+" "+b);
		
		while(f <= num) {
			f = a + b;
			if(f > num)
				break;
			
			System.out.print(" "+f);
			a = b;
			b = f;
		}
		
	}
}