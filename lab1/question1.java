package lab1;

public class question1 {

	public static void main(String[] args) {

		StringTimes("Hi", 2);
		
	}
	
	public static void StringTimes(String word, int times) {
		for (int i = 1; i <= times; i++) {
			System.out.print(word);
		}
	}
	

}