package sample;

import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		int i=2;
		int res=0;
		for(i=2;i<=n;i++){
			if(n%i==0) {
				res=res+1;	
			}
		}
		if (res>0) {
					System.out.println("not prime number");
					
				}
			else {
					System.out.println("prime number");
				}
			}
			
			
			
			
}






