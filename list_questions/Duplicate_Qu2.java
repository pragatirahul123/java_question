package list_questions;

import java.util.HashSet;
import java.util.Set;

public class Duplicate_Qu2 {

	public static void main(String[] args) {
	int arr[]= {2,2,4,7,8,9,2,7,7,1,6,4,4};
	Set<Integer>Set=new HashSet<Integer>();
	for(int i=0;i<arr.length;i++) {
		if ((Set.add(arr[i]) == false)){
			System.out.print(arr[i] + " " );
		}
	}
	

	}

}
