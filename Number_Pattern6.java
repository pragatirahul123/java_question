package whileloop_questions;

public class Number_Pattern6 {

	public static void main(String[] args) {
		int var = 1;
		for (var=1;var<100;var++) {
			if(var%2==0) {
				System.out.println(-var);
			}else {
				System.out.println(var);
			}
		}
}
}

