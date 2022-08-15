package globalandlocalveriable;

public class GlobalAndLocalVeriable {
	int a=50;//non static blobal veriable
	
	static int b=50;//static global veriable

	public static void main(String[] args) {
		GlobalAndLocalVeriable mh=new GlobalAndLocalVeriable();
		mh.
		test();//calling non static method from same class
		test1();//calling static method from same class
		System.out.println("global value of a is "+mh.a);//calling  non-static blobal veriable from same class
		System.out.println("global value of b is "+b);//calling static global veriable from same class
		System.out.println("====================================");
		int sum= 10+mh.a;//useg of non static global veriable from same class
		System.out.println(" sum of "+sum);
		System.out.println("==================================");
		int subs=300-b;//useg of static globalveriable for same class
		System.out.println("substraction of "+subs);
		System.out.println("==============================");
		System.out.println("value os staic blobal veriable from another class"+ajay.q);
		System.out.println("=====================================");
		ajay mn=new ajay();//object creted form different class
	      System.out.println(" value of non static veriable from another class"+mn.p);
	      System.out.println("========================================");
	}

	
	public void test() {
		int a=100;
		int sum=a+100;
		System.out.println("sum of ="+sum);
		
	}
	public static void test1() {
		
		int a=1000;
		int subs=a-500;
		System.out.println("====================");
		System.out.println(" substraction of ="+subs);
		System.out.println("=========================");
		
	}
}
