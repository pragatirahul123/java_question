package list_questions;

public class Report_Card2 {

	public static void main(String[] args) {
		int arr[][] = {{78, 76, 94, 86, 88},{ 91, 71, 98, 65, 76,},{95, 45, 78, 52, 49}};
		int sum=0;
		int average=0;
		for(int index=0;index<arr.length;index++) {
			for(int j=0;j<arr[index].length;j++) {
				sum = sum +arr[index][j];
				
			}
			average = sum/arr[index].length;
			System.out.println( average);
			
			sum=0;
		}
	    
	

	}

}
