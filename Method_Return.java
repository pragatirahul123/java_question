package sample;

public class Method_Return {

	public static void main(String[] args) {
		 method(19.7);
	   }

	   public static void method(double points) {
	      if (points >= 202.5) {
	         System.out.println("Rank:A1");
	      }else if (points >= 122.4) {
	         System.out.println("Rank:A2");
	      }else {
	         System.out.println("Rank:A3");
	      }

	}

}
