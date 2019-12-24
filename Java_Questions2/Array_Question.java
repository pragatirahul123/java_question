package practice_java;

import java.util.Scanner;

public class Array_Question {
	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter no.of element:");
		n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter all the elements:");

		for (int i = 0; i < n; i++) {

			a[i] = s.nextInt();
		}
	for (int i = 0; i < n; i++) {
		if (a[i] % 2 == 0) {
			System.out.println(i + 1);
		}
	}
}
}

