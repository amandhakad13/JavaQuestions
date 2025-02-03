import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a year : ");
		int year = sc.nextInt();
		
		sc.close();
		
		boolean istrue = false;
		
		if(year%4 == 0) {
			if(year%100==0){
				if(year%400==0){
					istrue = true;
				}
				else {
					istrue = false;
				}
			}
			else {
				istrue = true;
			}
		}
		else{
			istrue = false;
		}
		
		if(istrue){
			System.out.println("Given year is leap year");
		}
		else {
			System.out.println("Given year is not leap year");
		}
		
		
	}
}