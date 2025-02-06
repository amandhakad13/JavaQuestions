public class FindCommonInArray {

	public static void main(String[] args) {
		int[] arr1 = {1,2,3,7,4,5,6};
		int[] arr2 = {1,4,6,4,8,6,5,7};
		
		int temp,f=0;
		
		for(int i = 0; i < arr1.length; i++) {
			temp = arr1[i];
			for(int j = 0; j < arr2.length; j++) {
				if(arr1[i]==arr2[j]) {
					System.out.println("Common Element is : "+arr1[i]);
					f = 1;
					break;
				}
			}
		}
		
		if(f==0) {
			System.out.println("No Common element present in array.");
		}
	}
} 