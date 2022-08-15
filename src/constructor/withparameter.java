package constructor;

	
			

public class withparameter {
	//veriable decleration 
	int a;
	int b;
	int c;
	
	public withparameter()//user define without paremeter
	{
		//assigne value
		a=10;
		b=20;
		c=30;
	}
		public withparameter(int x)//user define cunstructor with single parameter
		{
			
		a=x;
		//b=defoult value=0
		//c=defoult value=0
		}
	public withparameter(int x,int y)//user define cunstructor with two parameter
	{	
		a=x;
		b=y;
		//c= defoult value =0
		
	}
	public withparameter(int x,int y,int z)//user define cunstructor with three parameter
	
	{
		
		a=x;
		b=y;
		c=z;
	}

	public static void main(String[] args) {
		withparameter mk = new withparameter();//object creation with zero parameter
		mk.add();
		withparameter mk1=new withparameter(40);// object creation for single parameter
		mk1.add();
		withparameter mk2= new withparameter(15, 15);//object creation for two paramter
		mk2.add();
		withparameter mk3= new withparameter(100, 100, 250);//object creation for three parameter
		mk3.add();
	  

	}

	
	public void add()//non static method without parameter
	{
	   int sum=a+b+c;
	   System.out.println("============================");
		System.out.println("sum of a+b+c= "+sum);
		System.out.println("============================");
	
	}
}
