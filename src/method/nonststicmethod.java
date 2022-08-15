package method;

public class nonststicmethod {

	public static void main(String[] args) {
		////class name objectname=new clasname();
		
		nonststicmethod n=new nonststicmethod();
		
		//to call non static method from same class
		//objectname.methodname();
		n.test();
     //calling non static from same class
		
		myclass m= new myclass();//create object of myclass
		//how to call non static method
		//syntx     objectname.methodname
		m.jyoti();
	}

	public void test()//non static regular method
	{
		
		System.out.println("this is test method");
	    System.out.println("my wife is very myat porgi");
	    
	    
	}
	
	
}
