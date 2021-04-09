package lab1;

public class question4 {

	public static void main(String[] args) {
		
		deerPlay(70, false); 
		deerPlay(95, false); 
		deerPlay(95, true); 
		
	}
	
	public static void deerPlay ( int temp, boolean isSummer ) {
		
		if(isSummer == false) {
			
			if (60 <= temp && temp <= 90) {
				System.out.println(true);
			}else {
				System.out.println(false);
			}
			
		}else if(isSummer == true) {
			
			if(60 <= temp && temp <= 100) {
				System.out.println(true);
			}else {
				System.out.println(false);
			}
			
		}
		
		
		
		
	}
	
	
}
