package InheritanceStudy;

public class hierarchical {

	public static void main(String[] args) {
		 
		a ok =new a();
		ok.gajanan();
		
		//crete object to class b
		
		B ok1=new B();//object of B class
		ok1.mukesh();//using object B calling method of B class
		ok1.gajanan();//using B object calling method A class 
		
		//crete object of C class
		
		c ok2 =new c();//object of c class
		ok2.ajay();// using object c calling method of c class
		ok2.gajanan();//using c class object calling method of a clsss
		

	}

}
