package sample;

import java.util.Scanner;

public class Second_LargestDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		int var=0;
		var=(num%100)/10;
			System.out.println("second number " + var);

	}

}
