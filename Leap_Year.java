package sample;

import java.util.Scanner;

public class Leap_Year {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a year");
		int q = sc.nextInt();
		if (q%4==0) {
			System.out.println("Leap Year " + q);
		}
		
			else {
				System.out.println("Not Leap year " + q);
				
			}
		}
		

	}


