// program using getter setter method
package basics;
import java.util.Scanner;
class Calculation{
	double number1, number2;
	public double getNumber1() {
		return number1;
	}
	public void setNumber1(double number1) {
		this.number1 = number1;
	}
	
	public double getNumber2() {
		return number2;
	}
	public void setNumber2(double number2) {
		this.number2 = number2;
	}
}

class Operations{
	double total;
	public double add(double n1,double n2) {
		total = n1+n2;
		return total;
	}
	
	public double subtract(double n1,double n2) {
		total = n1-n2;
		return total;
	}
	
	public double multiply(double n1,double n2) {
		total = n1*n2;
		return total;
	}
	public double divide(double n1,double n2) {
		total = n1/n2;
		return total;
	}

	public void setNumber1(double number1) {
		// TODO Auto-generated method stub
		
	}
}
public class CalculatorEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		double number1 = sc.nextDouble();
		System.out.println("Enter second number: ");
		double number2 = sc.nextDouble();
		Calculation c = new Calculation();
		c.setNumber1(number1);
		c.setNumber2(number2);
		Operations op = new Operations();
		double addTotal = op.add(c.getNumber1(), c.getNumber2());
		System.out.println("Addition of two numbers is: "+addTotal);
		double subTotal = op.subtract(c.getNumber1(), c.getNumber2());
		System.out.println("Subraction of two numbers is: "+subTotal);
		double mulTotal = op.multiply(c.getNumber1(), c.getNumber2());
		System.out.println("Multiplication of two numbers is: "+mulTotal);
		double divTotal = op.divide(c.getNumber1(), c.getNumber2());
		System.out.println("Division of two numbers is: "+divTotal);
		
		
		
		}
		
	}


