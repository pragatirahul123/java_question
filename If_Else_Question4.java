package saral_questions;

import java.util.Scanner;

public class If_Else_Question4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int litre = sc.nextInt();
		
		if(litre<1L) {
			System.out.println("pani bharna hai");
		
		}else if ((litre >=1L) &&(litre <10L)){
			System.out.println("pani nhi bharna");
			
		}else {
			System.out.println("overflow");
		}

	}

}
