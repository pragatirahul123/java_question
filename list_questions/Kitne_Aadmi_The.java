package list_questions;

public class Kitne_Aadmi_The {

	public static void main(String[] args) {
		int arr[]=new int[] {23, 14, 56, 12, 19, 9, 15, 25, 31, 42, 43};
		int count=0;
		int count1=0;
		int i=0;
		for(i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
					count=count+1;
			
			}else {
				
				count1=count1+1;
			}
				
		}
		System.out.println("even number " + count );
		System.out.println("odd number " + count1);
			
		
			
		}

	}








