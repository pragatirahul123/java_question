package sample;

import java.util.Scanner;

public class Array_Sum {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value");
		int q = sc.nextInt();
		int a[] = new int[q];
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter value " );
			a[i] = sc.nextInt();
			sum=sum+a[i];
		}
			System.out.print("sum of array " + sum);
		}
	}


