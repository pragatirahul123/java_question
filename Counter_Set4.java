package whileloop_questions;

import java.util.Scanner;

public class Counter_Set4 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("how many times");
		int num=sc.nextInt();
		int i=0;
		int sum=0;
		for(i=1;i<=num;i++) {
			Scanner scn = new Scanner(System.in);
			System.out.println("enter a number");
			int num1=scn.nextInt();
			sum=sum+num1;
			
		}
		System.out.println(sum);
	}

}
