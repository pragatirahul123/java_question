package sample;

import java.util.Scanner;

public class Largest_NumberOf_Factor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		for(int index=1;index<=n;index++) {
			if (n%index==0) {
				System.out.println(index);
			}
			
		}

	}

}
