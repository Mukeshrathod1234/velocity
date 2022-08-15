package controlstatment;

public class ElseIf {

	public static void main(String[] args) {
		
		// if its summer then its very hot 
		//if its rainy then its raining heavhely 
		//if its winter then its very cold
		//invalid season
		
		String season="summer";
		if (season=="summer")
		
		{
			System.out.println("its very hot");
		}
		else if (season=="rainy")
		{
			System.out.println("its running heavhily");
		}
		else if (season=="winter")
		{
		System.out.println("its very cold");	
		}
		else {
			System.out.println("invalid season");
			
		}
		
	}

}
