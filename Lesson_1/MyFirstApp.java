public class MyFirstApp {
	public static void main(String[] args) {

		int i = -6;
		int result = 0;
		
		while(i <= 6) {
			result = i;
			//i + iterator;
			
			System.out.println(result);

					
			int iterator = i + 2;
			i = iterator;
		}
	}
}