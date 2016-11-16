
public class UE2Beispiel1 {
//Uebung 12 => teil3.pdf
	
	public static void main(String[] args) {
		
		int [] numbers = {8, 0, 100, -10, 71, 6};
		
		System.out.println(containsNumber(numbers,4));
		System.out.println(containsNumber(numbers,0));
		System.out.println(containsNumber(numbers,71));
		System.out.println(containsNumber(numbers,-1));
		
	}

	public static boolean containsNumber(int[] arr, int num){
		
		for (int i = 0; i < arr.length; i++){
			if(arr[i] == num) {
				return true;
			}
			
		
		}
		return false;
	}
	
}
