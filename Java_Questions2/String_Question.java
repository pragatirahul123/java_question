package practice_java;

import java.util.Scanner;

public class String_Question {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out .println("enter a name");
		String sc = scanner.nextLine();
		for (int i = 0; i < sc.length(); i++) {
            char ch = sc.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u') {
		
            	 System.out.print(ch);
            	 System.out.println(i);

		}

	}

}
}
