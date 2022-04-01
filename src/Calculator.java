import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		char operator;
		BigDecimal number1, number2, result = null;
		
		Scanner input = new Scanner(System.in);
		input.useLocale(Locale.US);
		System.out.println("Chose an operator: +, -, *, %" );
		operator = input.next().charAt(0);
		System.out.println("Enter first number");
		number1 = input.nextBigDecimal();
		System.out.println("Enter second numbers");
		number2 = input.nextBigDecimal();
		
		switch(operator){
			case'+':
				result = Operation.sum(number1, number2);
				break;
			case'-':
				result = Operation.sub(number1, number2);
				break;
			case'*':
				result = Operation.mul(number1, number2);
				break;
			case'/':
				result = Operation.div(number1, number2);
				break;
			case'%':
				result = Operation.mod(number1, number2);
				break;
			default:
				
		}
		input.close();
		System.out.println(number1.doubleValue() + operator + number2.doubleValue() + " = " + result );

	}
}