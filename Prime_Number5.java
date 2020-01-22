package whileloop_questions;

import java.util.Scanner;

public class Prime_Number5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		int index = 2;
		int res = 0;
		for (index = 2; index <= num; index++) {
			if (num % index == 0) {
				res = res + 1;
			}
		}

		if (res == 2) {
			System.out.println("prime number");

		} else {
			System.out.println("not prime number");

		}		
			
		
	}
}
