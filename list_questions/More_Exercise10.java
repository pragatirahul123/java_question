package more_exercise_question;

public class More_Exercise10 {

	public static void main(String[] args) {
		int arr1[][]= {{45, 21, 42, 63}, {12, 42, 42, 53}, {42, 90, 78, 13}, {94, 89, 78, 76}, {87, 55, 98, 99}};
		for(int i=0;i<arr1.length;i++) {
			int max=0;
			for(int j=0;j<arr1[i].length;j++) {
				if (max<arr1[i][j]) {
					max = arr1[i][j];
				}
			}System.out.println(max);
			
		}
		
	}

}
