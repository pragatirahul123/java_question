package whileloop_questions;

public class Counter_Set1 {

	public static void main(String[] args) {
		int index=1;
		for( index=1;index<=100;index++) {
			
			if((index%3==0)&&(index%7==0)){
				System.out.println("Navgurukul");
			}
		
			else if(index%3==0) {
				System.out.println( "Nav");
				
			}else if(index%7==0) {
				System.out.println("Gurukul");
			
			}else {
				System.out.println(index);
			}

	}

}
}
