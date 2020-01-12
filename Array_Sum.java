package sample;

import java.util.Scanner;

public class Array_Sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num= sc.nextInt();
		int sum=0;
		int index=2;
		for(index=2;index<=num;index++) {
			sum=sum+index;
		}		
	System.out.println("sum of number" + sum);
		}

	}


