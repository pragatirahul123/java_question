package list_questions;

public class Duplicates_Number {

	public static void main(String[] args) {
		int arr[]= {19, 19,23,23,7,7,8,9};
		for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j]) { 
                    System.out.println(arr[i]); 
                
            }  
			}
		}
	}
}


	
	




