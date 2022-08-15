package interfaceuse;

public class implementation implements myinterface{

	public static void main(String[] args) {
		
		implementation ok=new implementation();
		ok.test();
		ok.test1();
		ok.test3();
		ok.sample(); 
		
		
	}

	@Override
	public void test() {
		System.out.println("this method from interface");
	}

	@Override
	public void test1() {
		System.out.println("test1 method from interace");
		
	}

	@Override
	public void test3() {
		System.out.println("test3 method from interface class");
		
	}
	    public void sample()
	    {
	    	
	    System.out.println("test4 is own method");
	    }
}
