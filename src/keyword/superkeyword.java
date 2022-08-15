package keyword;

public class superkeyword extends thiskeyword {

	public static void main(String[] args) {
		superkeyword mh =new superkeyword();
		mh.methhs();
		
		

	}
	public void methhs() {
int a=50;
int sum=a+150;
System.out.println(sum);
System.out.println("====================");


int sum1=super.a+200;

System.out.println(sum1);
System.out.println("========================");

int sum2=super.b+300;
System.out.println(sum2);
System.out.println("=================================");

	}
}
