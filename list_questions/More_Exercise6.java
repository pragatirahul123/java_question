package more_exercise_question;

import java.util.HashSet;
import java.util.Set;

public class More_Exercise6 {

	public static void main(String[] args) {
		String arr[]= {"Rishabh", "Rishabh", "Abhishek","Rishabh","Divyashish", "Divyashish"};
		Set<String>Set=new HashSet<String>();
		for(int i=0;i<arr.length;i++) {
			if ((Set.add(arr[i]) == true)) {
				System.out.println(arr[i] + " ");
			
	}
}
	}
}
		
		
		
		