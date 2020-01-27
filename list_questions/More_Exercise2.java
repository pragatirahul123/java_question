package more_exercise_question;

import java.util.Scanner;


public class More_Exercise2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("number of student");
		int num=sc.nextInt();
		System.out.println("ek student ka kracha");
		int var = sc.nextInt();
		int sum=num*var;
		for(int i=0;i<num;i++) {
			if(sum<=50000){
				System.out.println("Budget k under");
				break;
			}
			else {
				System.out.println("Budegt k bahar");
				break;
			}
		}
	}
}


