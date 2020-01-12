package sample;

public class Maximum_Number {

	public static void main(String[] args) {
		int [] arr = {2,4,7,9,1,13};
		int max=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max =arr[i];
			}
		}
		System.out.println(max);
			}
	
	
	
}

