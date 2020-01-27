package method_ques;

import java.util.Scanner;

public class Method_Ques5 {
	static int addition(int number1, int number2) {
		int sum = (int) (number1 + number2);
		return (sum);
	}

	static double  substraction(int var1, int var2) {
		double substraction = var1 - var2;
		return (substraction);
	}

	static double  multiplication(int num1,int num2) {

		double multiplication = num1 * num2;
		return (multiplication);

	}

	static double division(int x, int y) {
		double division = x / y;
		return (division);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter First Number");
		Integer  num1 = s.nextInt ();
		System.out.println("Enter Second Number");
		Integer num2 = s.nextInt();
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter a operator");
		String op = s1.nextLine();

		Method_Ques5 cal = new Method_Ques5();

		if (op.equals("addition")) {
			System.out.println(cal.addition(num1, num2));
		} else if (op.equals("substraction")) {
			System.out.println(cal.substraction(num1, num2));
		} else if (op.equals("multiplication")) {
			System.out.println(cal.multiplication(num1, num2));

		} else {
			System.out.println(cal.division(num1, num2));
		}
	
	}
}






	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	


