package methodWIithAnsWithoutParameter;

public class global{
	
	int a=50;
	
	static int b=100;

	public static void main(String[] args) {
		
		
		
		substraction();//static in same class

		global mk=new global();
		mk.addition();
	
	}
	
  public void addition()
  
  {
	  int a=500;
	  int sum=200+a;
	  System.out.println("addition of "+sum);
	  
  }
  public static void substraction()
  {
	  
	  int a=50;
			  int sub=a-25;
			  System.out.println("substr of "+sub);
	  
  }
  
}
