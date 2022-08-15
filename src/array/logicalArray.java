package array;

public class logicalArray {

	public static void main(String[] args) {
		int num[][]= {{1},{1,2},{1,2,3},{1,2,3,4}};
		
		for(int i=0;i<=3;i++) {
			 for(int j=0;j<=i;j++) {
				 System.out.print(num[i][j]+" ");
			 }
			 System.out.println();
		}

		System.out.println("=================");
		
	}

}
