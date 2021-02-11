package demo;

public class Calculator {
	public static void main(String[] args) {
		Calculator basicCal = new Calculator();
		basicCal.addNumbers(130, 140);
		basicCal.multiplyNumbers(130, 140);
		basicCal.addNumbers(30, 40);
		basicCal.multiplyNumbers(70, 40);
		basicCal.divideNumbers(80, 40);


		
		
	}
 public void addNumbers(int a, int b) {
	 int sum = a + b;
	 System.out.println("The sum of two numbers is " +sum );
 }
 public void multiplyNumbers( int a, int b) {
	 int multiply = a * b;
	 System.out.println("The product of two numbers is " +multiply );
 }
 public void divideNumbers(int a, int b) {
	 int divide = a / b;
	 System.out.println("The result of two numbers is " +divide );
 }
 public void subtractNumbers(int a, int b) {
	 int subtract = a - b;
	 System.out.println("The result of two numbers is " +subtract );
 }
 
}
