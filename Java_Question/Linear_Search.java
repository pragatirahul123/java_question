//import Java.util.Scanner;
public class Linear_Search {
	public static void main(String[]args) {
		int[] list1= {1,2,3,4,5,6,7 } ;
		int search = 5;
		for (int index =0; index<list1.length; index++) {
			if (list1[index]== search) {
					System.out.println("search is found at "+ index+" " + " " + "index position");
			}
		
		}
	
	}

}