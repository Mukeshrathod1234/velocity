package InheritanceStudy;

public class multipleINHERITANCE implements super1,super2,super3,super4{

	public static void main(String[] args) {
		multipleINHERITANCE kt =new multipleINHERITANCE();
		kt.cool1();
		kt.cool2();
		kt.cool3();
		kt.cool4();
		
		kt.mukesh();
		
		
      
		
		
		
		

	

	
	}

	@Override
	public void cool4() {
		System.out.println("this is super 4 class method");
		
	}

	@Override
	public void cool3() {
		System.out.println("this is super3 class method");
		
	}

	@Override
	public void cool2() {
		System.out.println("this is super 2 class method");
		
	}

	@Override
	public void cool1() {
		System.out.println("this is super 1 class method");
		
	


	}

	@Override
	public void mukesh() {
		
		super1.super.mukesh();
		super2.super.mukesh();
		super3.super.mukesh();
		super4.super.mukesh();
	}

	
}