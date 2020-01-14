package whileloop_questions;

import java.util.Scanner;

public class Multiply_Ques13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int input = sc.nextInt();
		System.out.println("enter a number");
		int input2 = sc.nextInt();
		int index=0;
		int sum=0;
		for(index=0;index<input;index++) {
			sum=sum+input2;
		}
			
			System.out.println(sum);
			
		}

	}


