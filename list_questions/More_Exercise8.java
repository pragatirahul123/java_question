package more_exercise_question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class More_Exercise8 {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList(Arrays.asList(1, 5, 10, 12, 16, 20));
		ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(1, 2, 10, 13, 16));
		list1.addAll(list2);
//		System.out.println(list1);

		Set<Integer> var = new HashSet<Integer>();
		for (int x:list1) {
			var.add(x);
		}
		System.out.println(var);

	}
}
