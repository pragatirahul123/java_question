package list_questions;

public class Max_Number {

	public static void main(String[] args) {
		int arr[]=new int[] {50, 40, 23, 70, 56, 12, 5, 10, 7,99};
		int max=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max =arr[i];
			}
		}
		System.out.println(max);
			}


	}

