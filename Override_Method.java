package sample;

public class Override_Method {
	void show(String a,int b) {
		System.out.println("1");
	}

}
class 	xyz extends Override_Method{
	void show(String a,int b) {
		System.out.println("2");
	}
	public static void  main(String[]args) {
		Override_Method t=new Override_Method ();
		t.show("tt",10);
		xyz x = new xyz();
		x.show("ss",20);
	}
}