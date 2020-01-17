package list_questions;

public class Edge_cases {

	public static void main(String[] args) {
		int arr[][] = {{78, 76, 94, 86, 88},{91, 71, 98, 65},{95, 45, 78}};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				sum=sum+arr[i][j];
			}
			
		}System.out.println(sum);
		                 
		                
		          
		               

	}

}
