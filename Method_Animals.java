package sample;

public class Method_Animals {
	
	public void eat() {
		System.out.println("I am eating mango");
		
	}
		public static void main(String[]args) {
			System.out.println("1");
			Method_Animals var = new Method_Animals();
			var .eat();
			var.run();
			Birds sp = new Birds();
			sp.fly();
			
		}
		public void run() {
			System.out.println("I am playing bootboll");
			
		}
}
class Birds{
		public void fly() {
			System.out.println("I am flying");
		}
}




