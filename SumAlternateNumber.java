public class SumAlternateNumber {
	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		int total = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(i % 2 == 0) {
				total = total + arr[i];
			}
		}
		System.out.println("Sum of alternate elements is : "+total);
	}
}