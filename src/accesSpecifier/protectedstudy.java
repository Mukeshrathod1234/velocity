package accesSpecifier;

public class protectedstudy {

	public static void main(String[] args) {
		protectedstudy mj =new protectedstudy();
		mj.mock();//access within class
		mj.mock1();//defalut within package
		mj.mock2();//within package
		mj.mock3();//within throught project

	}
  
	private void mock()//private access specifier
	{
		System.out.println(" my name is velocity");
		
	}
	void mock1()//default access specifier
	{
		
		System.out.println("im default");
	}
	protected void mock2()//ptotected access specifier
	{System.out.println("use withun package and cl outside the package eith the help of inheritance");
		
		
	}
	public void mock3()//public access specifier
	{
		System.out.println("autoamtion tsting");
		
	}
}
