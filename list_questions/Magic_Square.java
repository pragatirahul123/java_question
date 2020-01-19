package list_questions;

public class Magic_Square {

	public static void main(String[] args) {
		int[][] magic_square= {{8,3,4},
					{1,5,9},
					{6,7,2}};
		
		int count=0;
		int counter=magic_square.length-1;
		int sum=0;
		int store=0;
		while (count< magic_square.length) {
			sum=sum+magic_square[count][count];
			store=store+magic_square[counter][counter];
			count=count+1;
			counter=counter-1;
			
			
		}
		System.out.println(sum);
		System.out.println(store);
				
		

		
		                            
	}
}

	


