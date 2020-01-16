package list_questions;

public class Smaller_Big2 {

	public static void main(String[] args) {
		int arr[] = new int[] { 50, 40, 23, 70, 56, 12,38,39, 5, 10, 7 };
		int count = 0;
		int index = 0;
		for (index = 0; index < arr.length; index++) {

			if ((arr[index] > 20) && (arr[index] < 40)) {
				count = count + 1;
			}

		}
		System.out.println(count);


	}
}
