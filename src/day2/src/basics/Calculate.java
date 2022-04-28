//Using switch method
package basics;
import java.util.Scanner;
public class Calculate {

	public static void main(String[] args) {
		char operator;
		double num1, num2, total;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the operator: +,-,*,/");
		operator = sc.next().charAt(0);
		System.out.println("Enter first number");
		num1 = sc.nextDouble();
		System.out.println("Enter second number");
		num2 = sc.nextDouble();
		
		switch(operator) {
		
		case '+':
			total = num1+num2;
			System.out.println(num1 + " + "+ num2 + " = " + total);
			break;
			
		case '-':
			total = num1-num2;
			System.out.println(num1 + " - "+ num2 + " = " + total);
			break;
		
		case '*':
			total = num1*num2;
			System.out.println(num1 + " * "+ num2 + " = " + total);
			break;
		case '/':
			total = num1/num2;
			System.out.println(num1 + " / "+ num2 + " = " + total);
			break;
			
		default:
			System.out.println("Invalid input");
			break;
		}
		sc.close();	
	}

}
