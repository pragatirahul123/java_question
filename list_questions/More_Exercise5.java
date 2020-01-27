package more_exercise_question;

import java.util.Scanner;

public class More_Exercise5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int var=sc.nextInt();
		int i=1;
		int fact=1;
		for(i=1;i<=var;i++) {
			fact=fact*i;
		}
			
System.out.println(fact);
			
		}
		

	}


