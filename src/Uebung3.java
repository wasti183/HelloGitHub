
public class Uebung3 {

	public static double celsius2Fahrenheit(double celsius) {
		
		double fahrenheit = 9.0/5 * celsius + 32;
		return fahrenheit;
		
	}
	
	public static double Fahrenheit2celsius(double Fahrenheit) {
		
		double celsius = (Fahrenheit - 32) / (9.0/5);
		return celsius;
		
	}
	
	
	public static void main(String[] args) {
		
		double tempF = celsius2Fahrenheit(26.0);
		double tempC = Fahrenheit2celsius(26.0);
		
		System.out.println("fahrenheit:" + tempF);
		System.out.println("celsius:" + tempC);
		
		

	}

}
