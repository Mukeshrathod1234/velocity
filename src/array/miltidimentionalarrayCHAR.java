package array;

public class miltidimentionalarrayCHAR {

	public static void main(String[] args) {
		  char grade [][]= {{'a','b','c','d'},{'e','f','g','h'},{'i','j','k','l'}};
  
		  //print using for loop 
		  
		  
		 for(int r=0;r<=2;r++) {
			 
			 for(int t=0;t<=3;t++) {
				 System.out.print(grade[r][t]+" ");
			 }
			System.out.println();	 
		 }
		 
	}

}
