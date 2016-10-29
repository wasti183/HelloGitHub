
public class Uebung4 {

	public static void main(String[] args) {
		
		boolean result = isMetropolis(true, 280_000, 1_000);
		
		System.out.println("result: "+ result);
	}
		public static boolean isMetropolis (boolean isCapital, int inhabitants, double taxPerPersonAndMonth) {
			
			double taxes = inhabitants * taxPerPersonAndMonth * 12;
			
			if(inhabitants > 100_000 && isCapital == true
					|| taxes > 720_000_000 && inhabitants > 200_000) {
				return true;
			} else {
				return false;
			}
		
			//boolean resultA = isCapital && inhabitants > 100_000;
			//boolean resultB = taxes > 720_000_000 && inhabitants >200_000;
			
			//return result
			
		}

	}


