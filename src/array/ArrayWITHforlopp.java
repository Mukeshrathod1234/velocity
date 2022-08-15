package array;

public class ArrayWITHforlopp {

	public static void main(String[] args) {
		// array declerathod
		int a[]= {1,2,3,4,5,6,7};
		// print with the help of for loop
		
		// for aasending order
		for(int b=0;b<=a.length-1;b++) {
			
			System.out.println(b);
		}
		System.out.println("=================");
		//for decending order
		for(int s=a.length-1;s>=0;s--) {
			
			System.out.println(s);
		}
		System.out.println("==========");
		// aray for charecter 
		char gender[]= {'a','b','c','d','e','f'}; 
		
		//print assending order
		for(int d=0;d<=gender.length-1;d++)
		{
			System.out.println(d);
		}
		System.out.println("===========");
		//for print decending order
		for(int q=gender.length-1;q>=0;q--)
		{
			System.out.println(q);
			
		}
           
	}
}