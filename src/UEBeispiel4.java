
public class UEBeispiel4 {

	public static void main(String[] args) {
		
		System.out.println(triesUntilThreeOnes());
		
	}

	public static int triesUntilThreeOnes(){
		
		int zahl = 0;
		int zergebnis = 0;
		int ergebnis = 0;
		
		while (ergebnis < 3){
			zahl = 1+(int)(Math.random()*6);
			
			System.out.println(zahl);
			
			
			if (zahl == 1){
				ergebnis++;
			}
			
		}
		return zahl;
		
	}
	
}
