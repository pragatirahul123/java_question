package sample;

public class Refrence_Method {
	
	String colour;
	int age;
	void intObj(String c, int d){
		String colour = c;
		age = d;
	}
		public static void main(String[] args) {
		Refrence_Method var = new Refrence_Method();
		var.colour="red";
		var.age = 23;
		System.out.println(var. colour + " " + var. age);
	}

}
