package array;

public class matrixArray {

	public static void main(String[] args) {
		int yo [][]=new int[2][2];
		
		yo[0][0]=1;
		yo[0][1]=11;
	    yo[1][0]=22;
	    yo[1][1]=33;
		
		int ro [][]=new int[2][2];
		
		ro[0][0]=44;
		ro[0][1]=55;
		ro[1][0]=66;
		ro[1][1]=77;
		
		for(int i=0;i<=1;i++) {
			for(int j=0;j<=1;j++) {
				
				System.out.print(yo[i][j]+" ");
			}
			System.out.print("    ");
			
			for(int y=0;y<=1;y++) 
				
				 {
					
					System.out.print(ro[i][y]+" ");
				}
				System.out.println();
			
		}
		
		
				
		

	}

}
