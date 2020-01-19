package list_questions;

public class Average_Kitna_Hai {

	public static void main(String[] args) {
		int arr[]=new int[] {23, 14, 56, 12, 19, 9, 15, 25, 31, 42, 43};
		int count_even=0;
		int count_odd =0;
		int average_even=0;
		int average_odd=0;
		int sum_even=0;
		int sum_odd=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				count_even=count_even+1;
				sum_even=sum_even+arr[i];
				average_even=sum_even/count_even;
				
			}else {
				count_odd=count_odd+1;
				sum_odd=sum_odd+arr[i];
				average_odd=sum_odd/count_odd;
					
				}
				
				
					
				}

	System.out.println(average_even + " "+"even average");
	System.out.println(average_odd + " "+"odd average");
			
		}
				

	}


