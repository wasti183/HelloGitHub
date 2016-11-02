
public class UEBeispiel2 {

	public static void main(String[] args) {
		
		
		int zahl = 2;
		int ergebnis =0;
		
		for(int i=2;i<=9;i++){
		
			ergebnis = zahl * i;	
			System.out.println(zahl+"*"+i+"="+ergebnis);
			zahl = ergebnis;
		}
		
		for(int i=2;i<=9;i++){
			
			ergebnis = zahl / i;	
			System.out.println(zahl+"/"+i+"="+ergebnis);
			zahl = ergebnis;
		}
		
		
	}

}
