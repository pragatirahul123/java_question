package sample;

public class Matrix_Dimensional {

	public static void main(String[] args) {
		int first[][]= {{1,5,2},{3,0,1},{4,2,3}};
		int second[][]= {{4,1},{1,6},{3,1}};
		
		int multi[][] = new int[3][2];
		
		for(int i=0;i<3;i++) {  //row
			for(int j=0;j<2;j++) { //column
				for(int k=0;k<3;k++) {
					multi[i][j]=multi[i][j]+(first[i][k]*second[k][j]);
				}
			}
		}

	
	for(int i=0;i<3;i++) {
		for(int j=0;j<2;j++) {
			System.out.print(multi[i][j] + " ");
		}
	}
		
	}

}
