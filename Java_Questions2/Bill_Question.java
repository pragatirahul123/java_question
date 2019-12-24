package practice_java;

import java.util.Scanner;

public class Bill_Question {

		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			double num;
			System.out.println("Enter reading");
			num = s.nextDouble();

			if (num <= 100) {
				System.out.println(1.5 * num);
			}
			if (num > 100 && num < 150) {
				double a = (100 * 1.5);
				double b = (num - 100);
				double c = (b * 2);
				System.out.println(a + c);
			}
			if (num > 150) {
				double a = (100 * 1.5);
				double b = (50 * 2);
				double c = (num - 150);
				double d = (c * 3);
				System.out.println(a + b + d);
		}
	}
}

