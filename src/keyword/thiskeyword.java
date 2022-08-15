package keyword;

public class thiskeyword {
	
	int a=100;//non static global veriable
	int b=500;

	public static void main(String[] args) {
		thiskeyword mk =new thiskeyword();
		mk.test();
		

	}
public void test()
{
	int a=20;//local veriable
	int sum=a+150;//a value is a localvalue
	System.out.println(sum);
	System.out.println("==========================="); 
	
	int sum1=this.a+150;
	System.out.println(sum1);
	
	System.out.println("local value of a is "+a);
	System.out.println("global value of a is "+this.a);
	System.out.println("global value of b is "+this.b);
	
	
	
	
}
}
