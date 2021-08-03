import java.util.Scanner; 

public class Calculator {

	int fistNumber, secondNumber, result;
	char operation;
	char continueCalculation;
	
	public void getCalculation() {

		do {
		
			Scanner scan = new Scanner(System.in);

			System.out.println("Введите первое число: ");
			fistNumber = scan.nextInt();

			System.out.println("Введите второе число: ");
			secondNumber = scan.nextInt();

			System.out.println("Введите операцию: ");
			operation = scan.next().charAt(0);


			switch(operation) {
			case '+': System.out.println(result = fistNumber + secondNumber) ;
			break;
			case '-': System.out.println(result = fistNumber - secondNumber) ;
			break;
			case '*': System.out.println(result = fistNumber * secondNumber) ;
			break;
			case '/': System.out.println(result = fistNumber / secondNumber) ;
			break;

			default:  System.out.println("Операция не введена.");

			}

			System.out.println("Еще раз?");
			continueCalculation = scan.next().charAt(0);

		} while(continueCalculation == 'y');

	}
}