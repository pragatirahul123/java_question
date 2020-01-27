package more_exercise_question;

import java.util.Scanner;

public class More_Exercise4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int var=sc.nextInt();
		System.out.println("enter a number");
		int num=sc.nextInt();
		System.out.println("enter a number");
		int max=sc.nextInt();
		
		if((var>num)&&(var>max)){
			System.out.println(" max number " + var);
		}
		
		else if  ((num>max )&& (num>max)){
			System.out.println("max number " + num);
		
			
		}else {
			System.out.println("max number " + max);
			
		}
	}

}
