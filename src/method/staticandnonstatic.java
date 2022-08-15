package method;

public class staticandnonstatic {

	public static void main(String[] args) {
		staticandnonstatic g= new staticandnonstatic();// calling non static method 
		g.add();
		
        sub();//callinf static method
	}

	
	public void add()
	{
		int a;
		int b;
		int addition;
		a=10;
		b=20;
       addition=a+b;
       System.out.println(" addition of a+b= "+addition);
	}
	public static void sub() {
		
	int a;
	int b;
	int subs;
	a=100;
	b=50;
	subs=a-b;
	System.out.println(" substraction of a-b= "+subs);
	}
}
