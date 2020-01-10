package sample;

public class LinearSearch_String {
	public static void main(String[]args) {
		String [] a= {"mona","hina","sona","ritu"};
		String var = "neha";
		int items=0;
		for(int i=0;i<a.length;i++) {
			if (a[i].equals(var)) {
				System.out.println("elment of string " + i);
				items = items+1;
				
			}
		}
		if (items==0) {
			System.out.println("items not found");
		}
	}

}
