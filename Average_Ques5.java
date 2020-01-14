package whileloop_questions;

import java.util.Scanner;

public class Average_Ques5 {

	public static void main(String[] args) {
		int index=1;
		int sum=0;
		while(index<11) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int input = sc.nextInt();
		sum=sum+input;
		index=index+1;}
		
		System.out.println(sum);
		
		if(sum%5==0) {
			System.out.println("yes");
		}else {
			System.out.println("No");
		}
		

	}
	}


