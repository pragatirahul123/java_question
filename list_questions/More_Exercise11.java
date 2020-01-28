package more_exercise_question;

import java.util.ArrayList;

public class More_Exercise11 {

	public static void main(String[] args) {
		String s = ("NavGurukul is an alternative to higher education reducing the barriers of current formal education system");
		ArrayList<String> str = new ArrayList<String>();
		String[] words = s.split(" ");
		for (int i = 0; i < words.length; i++) {
			str.add(" \""+ words[i] +" \"");
		}
		System.out.println(str);

	}
}
