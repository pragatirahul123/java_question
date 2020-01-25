package method_ques;

public class Method_Ques3part2 {
	static void display(int a[],int b[]) {
		int i;
		for(i=0;i<a.length;i++) {
			System.out.println(a[i]+b[i]);
			System.out.println("--------------");
		}
		
			
	}

	public static void main(String[] args) {
		int[] x= {50,60,10};
		int[] y= {10,20,13,};
		display(x,y);
		
}
}