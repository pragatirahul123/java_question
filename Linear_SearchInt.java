package sample;

public class Linear_SearchInt {
	public static void main(String[]args) {
		//int [] arr = {2,4,6,7,8,9};
		//int items = 8;
		//for (int i=0;i<arr.length;i++) {
			//if (arr[i]==items) {
				//System.out.println("elememt of value " + i);
			
		
		int [] arr = {2,3,4,5,6};
		int  items = 10;
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			if (arr[i]==items){
				System.out.println("element of value " + i);
				temp=temp+1;
			}
		}
		if(temp==0) {
			System.out.println("items not found ");
		}
	}
}
		
		