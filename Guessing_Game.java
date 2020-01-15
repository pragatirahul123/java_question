package whileloop_questions;

import java.util.Scanner;

public class Guessing_Game {

	public static void main(String[] args) {
		int guess_num=5;
		for(int index=1;index<=5;index++) {
			Scanner sc= new Scanner(System.in);
			System.out.println("enter a number");
			int guess = sc.nextInt();
			if(guess == guess_num) {
				System.out.println("guess brabar hai");
				break;
	
			}else {
				System.out.println("guess galt hai");
			}
			
			
		}
		

	}

}
