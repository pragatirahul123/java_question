package sample;

import java.util.Scanner;

public class Logical_QuestionArray {
	public static void main(String[]args) {
 		   int arr[] = new int[3];
	       int n, i;
	       Scanner scan = new Scanner(System.in);
		   
	       System.out.print("How Many Element  ");
	       n = scan.nextInt();
		   
	       for(i=0; i<n; i++)
	       {
	           arr[i] = scan.nextInt();
	       }
		   
	       System.out.print("Elements ");
	       for(i=0; i<n; i++)
	       {
	           System.out.print(arr[i] + "  ");
	       }
		}
	}


