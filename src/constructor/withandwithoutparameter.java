package constructor;

public class withandwithoutparameter {
    int a;
	int b;
	int c;
public withandwithoutparameter()//zero parameter 
{
	
	a=15;
	b=15;
	c=15;
}
	public withandwithoutparameter(int x)//constructor with single parameter
	{
		a=x;
	}
	public withandwithoutparameter(int x,int y)//contructor with twoparameter
	{
		a=x;
		b=y;
	}
	public withandwithoutparameter(int x,int y,int z)//constructor with three parameter
	{
		a=x;
		b=y;
		c=z;
	}

	public static void main(String[] args) {
withandwithoutparameter jb=new withandwithoutparameter();
jb.add();
withandwithoutparameter jb1 = new withandwithoutparameter(50);
jb1.add();
withandwithoutparameter jb2= new withandwithoutparameter(50, 50);
jb2.add();
withandwithoutparameter jb3=new withandwithoutparameter(50, 50, 50);
jb3.add();


	}
public void add() {
	
	
	int sum=a+b+c;
	System.out.println("sum of a+b+c="+sum);
	System.out.println("====================================");
}
}

