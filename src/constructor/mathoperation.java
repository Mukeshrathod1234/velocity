package constructor;

public class mathoperation {
	
	int a;//veriable decl
	int b;
	
	public mathoperation() {
		System.out.println("===============");
		a=50;
		b=50;
		
	}

	public static void main(String[] args) {
	mathoperation mo=new mathoperation();
	mo.add();
	}

	public void add() {
		
	a=20;
	b=30;
	int sum=a=b;
	System.out.println("sum of a+b= "+sum);
		
		
		
	
	}
	
}
