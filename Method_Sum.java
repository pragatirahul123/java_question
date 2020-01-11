package sample;

public class Method_Sum {
	 int sum = 0; 
     
	    public int addTwoInt(int a, int b){ 
	        sum = a + b; 
	        return sum;  
	    } 
	      
	} 
	  
	class GFG { 
	    public static void main (String[] args) {  
	        Method_Sum add = new Method_Sum(); 
	        int s = add.addTwoInt(1,2); 
	        System.out.println("Sum of two integer values :"+ s); 
	          
	    } 


}

