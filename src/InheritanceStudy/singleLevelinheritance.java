package InheritanceStudy;

public class singleLevelinheritance {

	public static void main(String[] args) {
		//single level inheritance
		
		son mk =new son();//create oblect to call the non static method 
		mk.mobile();//cl non ststic sons method 
		mk.nature();//cl non static mothers method
		
		// for calling static method
		
		son.laptop();
		son.look();
	}

}
