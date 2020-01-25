package list_questions;

public class Second_Max {

	public static void main(String[] args) {
		int arr[]=new int[] {50, 40, 23, 70, 56, 12, 5, 10, 7};
		int lar=0;
		int second=0;
		for(int i =0;i<arr.length;i++) {
			if(arr[i]>lar) {
				second=lar;
				lar=arr[i];
			
		}else if(arr[i]>second) {
			second=arr[i];
		}

	}
		System.out.println("second max " + second);
}
}
