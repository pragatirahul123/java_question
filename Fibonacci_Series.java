package whileloop_questions;

public class Fibonacci_Series {

	public static void main(String[] args) {
		int var=1;
		int varx=0; 
		while (varx<10) {
			System.out.println(varx);
			int z=varx;
			   varx=var;
			   var=z+var;
		}

	}

}
