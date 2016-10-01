
public class Uebung3 {

	public static double celsius2Fahrenheit(double celsius) {
		
		double fahrenheit = 9.0/5 * celsius + 32;;
		return fahrenheit;
		
	}
	
	
	public static void main(String[] args) {
		
		double tempF = celsius2Fahrenheit(26.0);
		
		System.out.println("fahrenheit:" + tempF);
		
		
		

	}

}
