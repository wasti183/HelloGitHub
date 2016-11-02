
public class UEBeispiel1 {

	public static void main(String[] args) {
		
		boolean result = isWinterreifenPflicht(2, false);
		
		System.out.println("Winterreifen "+result);

	}

	public static boolean isWinterreifenPflicht(int temperatur,boolean rutschigeFahrbahn){
		
		if(temperatur <10 && rutschigeFahrbahn == true){
			return true;
		}
		else if(temperatur <4){
			return true;
		}
		else{
			return false;
		}
	}

	
}
