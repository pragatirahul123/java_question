import java.util.Scanner;

public class Odd_count {
	public static void main(String[] args) {
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		s = sc.nextLine();
		int count = 0;
		for (int i = 0; i < s.length();i++ ) {

				count = count + 1;
			}
			System.out.println( count);

		}
	}



