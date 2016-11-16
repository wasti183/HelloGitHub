
public class UE2Beispiel3 {

	public static void main(String[] args) {
		
		
		int[] numbers = { 8, 0, 100, -10, 71, 6 };
		
		
		printArray(reverse(numbers));
		

	}

	public static int[] reverse(int[] orig) {
		
		int[] result = new int[orig.length];
		
			int j = result.length-1;
		for (int i = 0; i < result.length; i++) {
			
			result[j] = orig[i];
			j--;
		}
		
		
		return result;
	}
	
	public static void printArray(int[] arr) {
		
		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}
		
		System.out.println();
			
	}
	
}
