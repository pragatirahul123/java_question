package list_questions;

public class Kitne_Crorepati {

	public static void main(String[] args) {
		int[]arr= {3000, 600000, 324990909, 90990900, 30000, 5600000, 690909090, 31010101, 532010, 510, 4100};
		int i=0;
		int count=0;
		int counter=0;
		int var =0;
		while (i<arr.length) {
			if(arr[i]>=10000000 ){
				count=count+1;
		
			}else if((arr[i]>=100000) && (arr[i]>=100000))
				counter=counter+1;
		    else {
				var=var+1;
		    }	
			i=i+1;
			
		
			
		}
		System.out.println("corepati " + count);
		System.out.println("lakhpati " + counter);
		System.out.println("dilwale " + var);
			
			
	}	
			
	
}


	


