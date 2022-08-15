package array;

public class integer {

	public static void main(String[] args) {
		
		
		
		int age[]=new int[4];
		age[0]=17;  age[1]=54;  age[2]=76; age[3]=65;
		
		System.out.println(age[0]);
		System.out.println(age[1]);
		System.out.println(age[2]);
		System.out.println(age[3]);
		System.out.println("==========");
		
		// bye using  for loop print assending order
		for(int i=0;i<=3;i++) {
			System.out.println(age[i]);
		}
		System.out.println("=========");
		// using for loop print decending order
		for(int a=3;3>=0;a--) {
			System.out.println(age[a]);
		}

	}

}
