package list_questions;

public class Array_Sum {

	public static void main(String[] args) {
		int arr[]= {10, 11, 12, 13, 14, 17, 18, 19};
		int num=30;
		
		for(int index=0;index<arr.length;index++) {
			for(int jar=index+1;jar<arr.length;jar++) {
				if(arr[index]+arr[jar]==num) {
					System.out.println (arr[index]+" + " + arr[jar]+" ="+num);
				}
			}
		}
	}

}
