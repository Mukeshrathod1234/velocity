package arrayshubham;

public class prctice {

	public static void main(String[] args) {
		
		int a[]=new int[5];
		
		a[0]=11;  //0==even
		a[1]=22;  //1=odd
		a[2]=33;    //2 even
		a[3]=44;     //3 odd
		a[4]=55;    //4 even
		
		
//	for(int i=0;i<=a.length;i++) {
//			
// 			System.out.println(a[i]);
//		}

		//for odd index position
   for(int j=1;j<=a.length;j=j+2) {
	   System.out.println(a[j]);
   }
		//
	}

}
