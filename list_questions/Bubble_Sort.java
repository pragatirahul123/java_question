package list_questions;

public class Bubble_Sort {

	public static void main(String[] args) {
		int arr[]= {9,8,6,4,1,3,2,5,7};
		int index = 0;
		while (index < arr.length) {
			int var = index+1;
			while (var < arr.length) {
				if (arr[index] < arr[var]) 
				{
					int result = arr[index];
					arr[index] = arr[var];
					arr[var] = result;
				}
				
				var = var + 1;

		}
			System.out.println(arr[index]);
			
			index = index + 1;
	}
	}
}

	
			
	


