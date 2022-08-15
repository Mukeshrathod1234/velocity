package InheritanceStudy;

public class MultiLevelInheritance {

	public static void main(String[] args) {
		// cl for non ststic method in ihneritance
       
		son mr = new son();//create object to cl for non static method
		
		 mr.mobile();
		 mr.nature();
		 mr.love();
		 
		 //for stsic method
	
		son.stories();
		son.look();
		son.laptop();
}
}