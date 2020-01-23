package saral_questions;

import java.util.Scanner;

public class Age_Question {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enetr a number");
		int age = sc.nextInt();

		if (age > 5) {
			System.out.println("school ja skta hai");

		}
		if (age > 18) {
			System.out.println("vote de skta hai");

		}
		if (age > 21) {
			System.out.println("car drive kr skta hai");

		}
		if (age > 24) {
			System.out.println("shadi kr skta hai");

		}
		if (age > 25) {
			System.out.println("legally drink kr skta hai");

		} else {
			System.out.println("eligible");
		}
	}

}
