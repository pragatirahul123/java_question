package list_questions;

import java.util.Scanner;

public class Palidrome_Que {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a any name");
		String name = sc.nextLine();
		String ReverseName = ""; 
		for (int index = name.length() - 1; index >= 0; index--) {
			ReverseName += name.charAt(index);
		}
		if (name.equals(ReverseName)) {
			System.out.println("palindrome");
		} else {
			System.out.println("not palindrome");
		}

	}
}
