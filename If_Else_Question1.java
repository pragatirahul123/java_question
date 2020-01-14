package saral_questions;

import java.util.Scanner;

public class If_Else_Question1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		System.out.println("enter a number");

		if (input< 10) {
			System.out.println("10 se cota hai");
		} else if ((input > 10) && (input < 20)) {
			System.out.println("20 se chota hai");
		} else {
			System.out.println("20 se bada hai");
		}
	}

}
