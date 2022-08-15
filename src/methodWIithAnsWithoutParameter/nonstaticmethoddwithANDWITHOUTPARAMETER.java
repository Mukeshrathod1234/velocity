package methodWIithAnsWithoutParameter;

public class nonstaticmethoddwithANDWITHOUTPARAMETER {

	public static void main(String[] args) {
		nonstaticmethoddwithANDWITHOUTPARAMETER k = new nonstaticmethoddwithANDWITHOUTPARAMETER();//zero parameter non ststic
	   k.std();//call non- stat methon in same class 
       k.std(45, 78, 75, 56, 78, 88);//calling non ststic method with parameter in same class
       k.std(97, 97, 95, 95, 94, 93);//again cl in same class non-stats
	}
public void std() {
	
	int thermal;
	int mechanics;
	int designe;
	int drawing;
	int eclips;
	int python;
	 
	thermal=65;
	mechanics=70;
	designe=75;
	drawing=85;
	eclips=55;
	python=71;
	
	System.out.println("========================================================");
	System.out.println("marks in themal egineering = "+thermal+" out of 100");
	System.out.println("marks in mechanics = "+mechanics+" out of 100");
	System.out.println("marks in designe engineering = "+designe+" out if 100");
	System.out.println("marks in drawing = "+drawing+" out of 100");
	System.out.println("marks ineclips = "+eclips+" out of100");
	System.out.println("marks in python = "+python+" out of 100");
	System.out.println("==========================================================");
	
	
	
	
} 
public void std(int thermal,int mechanics,int designe,int drawing,int eclips,int python)
{
	System.out.println("========================================================");
	System.out.println("marks in themal egineering = "+thermal+" out of 100");
	System.out.println("marks in mechanics = "+mechanics+" out of 100");
	System.out.println("marks in designe engineering = "+designe+" out if 100");
	System.out.println("marks in drawing = "+drawing+" out of 100");
	System.out.println("marks ineclips = "+eclips+" out of100");
	System.out.println("marks in python = "+python+" out of 100");
	System.out.println("==========================================================");
	

}


}
