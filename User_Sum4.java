package whileloop_questions;

import java.util.Scanner;

public class User_Sum4 {

	public static void main(String[] args) {
		int var=1;
		int sum=0;
		for(var=1;var<=10;var++) {
			Scanner sc= new Scanner(System.in);
			System.out.println("enter a number");
			int input = sc.nextInt();
			sum=sum+input;
			
		}
		System.out.println(sum);
		

	}

}
