package lab1;

public class question5 {

	public static void main(String[] args) {
		
		caughtSpeeding(60, false);
		caughtSpeeding(65, false);
		caughtSpeeding(65, true);
		
	}
	
	
	
	public static void caughtSpeeding (int speed , boolean isBirthday) {
		int result = 0;
		
		if(isBirthday == false) {
			
		    if (speed <= 60 && speed >= 0) {
				result = 0;	
			}else if(speed >= 61 && speed <= 80) {
				result = 1;			
			}else if (speed >= 81) {
				result = 2;			
			}else if (speed < 0){
				System.out.println("Invalid speed!");
			}	
			
		}else {
			
			if (speed <= 65 && speed >= 0) {
				result = 0;	
			}else if(speed >= 66 && speed <= 85) {
				result = 1;			
			}else if (speed >= 86) {
				result = 2;			
			}else if (speed < 0){
				System.out.println("Invalid speed!");
			}
			
		}
		
		System.out.println(result);
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
}
