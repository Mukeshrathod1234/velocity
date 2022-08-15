package methodWIithAnsWithoutParameter;

public class globalandlocalveriable {
	
	int a=50;//non ststic global veriable 
	 static int b= 90;//static global veriable

	public static void main(String[] args) {
		
		globalandlocalveriable mk=new globalandlocalveriable();
		mk.add();
		test();
		System.out.println("global value of a is "+mk.a);//non static global veriable 
		System.out.println("global value of b is "+b);//static blobal veriable 
		System.out.println("============================");
		int sum=150+mk.a;
		System.out.println("sum of "+sum);//non static blobal veriable from same class
		int subs=110-b;
		System.out.println("sum of "+subs);
		System.out.println("==============================");//static global veriable from same class
		System.out.println("value of  static global veriable from another class "+anu.q);
		anu mh=new anu();
		System.out.println("value of non static global veriable from another class "+mh.p);
		System.out.println("===============================================");
		

	}
  public void add()
  {
	  
	  int a=100;
	  int sum=a+100;
	  System.out.println("sum of "+sum);
	  System.out.println("=====================================");
  }
  public static void test()
  {
	  
	  int a=1000;
	  int subs=a-500;
	  System.out.println("substraction of "+subs);
	  System.out.println("=================================");
  }
}
