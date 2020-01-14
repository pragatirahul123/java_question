package whileloop_questions;

public class Fibonacci_Series {

	public static void main(String[] args) {
		int var=1;
		int varx=1; 
		while (var<10) {
			System.out.println(var);
			int z=varx;
			   var=varx;
			   varx=z+varx;
		}

	}

}
