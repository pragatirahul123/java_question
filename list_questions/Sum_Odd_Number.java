package list_questions;

public class Sum_Odd_Number {

	public static void main(String[] args) {
		int arr[]=new int [] {23, 14, 56, 12, 19, 9, 15, 25, 31, 42, 43};
		int var=0;
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				var=var+arr[i];
				
			}else {
				sum=sum+arr[i];
				
			}
		}
				
	System.out.println("even number of sum " + var);
	System.out.println("odd number of sum " + sum);
	
		
	}
		
	}

		
				
			
		
	



	


