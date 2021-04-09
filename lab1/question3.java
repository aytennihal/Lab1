package lab1;

public class question3 {

	public static void main(String[] args) {
		
		specialEleven(23);
		
	}
	
	public static void specialEleven (int num) {
		
		if(num%11==0 || num%11==1) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
			
		
	}
}
