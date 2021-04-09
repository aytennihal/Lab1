package lab1;

public class question6 {

	public static void main(String[] args) {
		
		cigarParty(30, false);
		cigarParty(50, false);
		cigarParty(70, true);
		
	}
	
	public static void cigarParty(int cigars , boolean isWeekend) {
		
		if (isWeekend == false) {
			
			if (cigars >=40 && cigars<=60) {
				System.out.println(true);
			}else {
				System.out.println(false);
			}
				
			
		}else {
			
			if (cigars >=40 ) {
				System.out.println(true);
			}else {
				System.out.println(false);
			}
				
			
			
			
		}
		
		
		
		
		
	}
		

	
	
	
}
