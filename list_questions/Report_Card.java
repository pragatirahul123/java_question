package list_questions;

public class Report_Card {

	public static void main(String[] args) {
		int marks[][]= {{78, 76, 94, 86, 88},{91, 71, 98, 65, 76},
                {95, 45, 78, 52, 49}};
		                     
		int sum=0;
		for(int index=0;index<marks.length;index++) {
			for(int j=0;j<marks[index].length;j++) {
				sum=sum+marks[index][j];
				
				
			}
		}System.out.println(sum);

	}

}
