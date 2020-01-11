package sample;

public class Polymorphism {
	
	void show(int a)
	{
		System.out.println("1");
		
	}
	void show() {
		System.out.println("2");
	}
	public static void main(String[]args) {
		Polymorphism p = new Polymorphism();
		p.show(10);
		
	}

}

