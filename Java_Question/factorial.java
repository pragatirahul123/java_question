import java.util.Scanner;
public class factorial {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter a number");
		int number = input.nextInt();
		int fact=1;
		int index = 1;
		while (index <=number ) {
			fact=fact*index;
			index=index+1; }
		System.out.println(fact);
		
	}

}
