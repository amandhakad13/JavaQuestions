import java.util.Scanner;

public class PowerOfNumber {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		
		System.out.print("Enter a power : ");
		int pow = sc.nextInt();
		
		int temp = num;
		
		sc.close();
		
		if(pow == 0) {
			System.out.print("power of a number is : "+1);
		}
		else {
			
			for(int i = 1; i < pow; i++) {
				num = temp * num;
			}
			
			System.out.print("power of a number is : "+num);
		
		}
		
	}
}