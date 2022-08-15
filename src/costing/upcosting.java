package costing;

public class upcosting {

	public static void main(String[] args) {
		son s= new son();
		father f= new father();
		//for son class
		s.car();
		s.bike();
		s.clg();
		System.out.println("=================");
		// for father class
		
		f.car();
		f.bike();
		f.shop();
		System.out.println("===================");
		
		//up casting
		
		father fb = new son();
		fb.car();
		fb.bike();
		fb.shop();
		

	}

}
