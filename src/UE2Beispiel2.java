
public class UE2Beispiel2 {

	public static void main(String[] args) {
		
		
		int[] numbers = { 8, 0, 100, -10, 71, 6 };

		System.out.println(calculateSum(numbers));
		

	}

	public static int calculateSum(int[] arr) {
		
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i]; 
		}
		
		return sum;
	}
	
}
