package method_ques;

public class Method_Ques4part1 {
	static void divisible(int a[]){
		int i;
		for(i=0;i<2;i++) {
			if (a[i]%2==0) {
			System.out.println("even number");
			
			
		}else {
			System.out.println("odd number");
		}
		}
		}

	public static void main(String[] args) {
		int[] x= {2,7};
		divisible(x);
		

	}

}
