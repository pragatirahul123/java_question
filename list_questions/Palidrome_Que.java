package list_questions;

public class Palidrome_Que {
	public static void main(String[]args) {
		String name[]=new String[]{"n","i","t","i","n"};
		int i=0;
		for(i=0;i< name.length;i++) {
			
			for(int b = name.length - 1; b >= 0; b--) {
			
				if(name[i] == name[b]) {
					System.out.println("it's palidrome");
					break;
		}
				else {
					System.out.println("its not palidrome");
		}
		
	}

	}
}
}
