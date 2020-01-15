package whileloop_questions;

import java.util.Scanner;

public class Guessing_Game2 {

	public static void main(String[] args) {
		int guess_num=5;
		for(int index=1;index<=10;index++) {
			Scanner sc= new Scanner(System.in);
			System.out.println("enter a number");
			int guess = sc.nextInt();
			if(guess<guess_num) {
				System.out.println("guess chota hai");
				
			}else if( guess>guess_num) {
				System.out.println("guess bada hai");
				
			}else if(guess_num==guess) {
				System.out.println("waahh!!! guess  brabr hai");
					break;
			}
		}
	}
}
			
