public class FindDuplicateInArray {

	public static void main(String[] args) {
		int[] arr = {1,1};
		int temp, count, f=0;
		
		for(int i = 0; i < arr.length; i++) {
			temp = arr[i];
			count = 1;
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i]==arr[j]) {
					count++;
					if(count>1){
						System.out.println("Duplicate Element is : "+arr[i]);
						f = 1;
						break;
					}
				}
			}
		}
		
		if(f==0) {
			System.out.println("No duplicate element present in array.");
		}
	}
} 