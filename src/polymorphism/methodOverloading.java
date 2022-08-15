package polymorphism;

public class methodOverloading {

	public static void main(String[] args) {
		methodOverloading gk =new methodOverloading();
		gk.rathod();
		gk.rathod(10);
		gk.rathod(10, 10);
		gk.rathod(10, 15,10);
		
	
	}
public void rathod()
{int a=15;
int b=30;
int sum=a+b;
System.out.println("sum of "+sum);	
}
public void rathod(int a)
{ int b=20;
int sum1=a+b;
System.out.println("sum os "+sum1);
}
public void rathod(int a,int b)
{
	int c=10;
	int sum2=a+b+c;
	System.out.println("sum of"+sum2);
}
public void rathod(int a,int b,int c)
{
	int d=10;
	int sum3=a+b+c+d;
	System.out.println("sum of"+sum3);
}
public void cool(String name,int age,float weight,float height)
{
	
	
}
}
