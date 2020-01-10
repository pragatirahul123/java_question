package sample;

//import java.util.Arrays;
import java.util.Scanner;

public class Array_OneDimension {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value");
		int q = sc.nextInt();
		int a[] = new int[q];
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter value " );
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}
}

