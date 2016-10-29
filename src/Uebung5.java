
public class Uebung5 {

	public static void main(String[] args) {
		
		int zahl = 128;
		int teiler = 2;
		
		while(teiler < zahl){
			
			if(zahl % teiler == 0){
				System.out.println("Teiler "+ teiler +" gefunden");
			}	
			
			teiler++;
		}
		
		

	}

}
