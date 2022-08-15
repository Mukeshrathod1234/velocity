package controlstatment;

public class switchstudy {

	public static void main(String[] args) {
		// if today is monday--> this is the first day of the wee
		//if tuesday---> this is the 2nd day of the week
       // if wednesday---> this is the 3rd day of the week
		//if thusday---> this is the 4rth day of the week
		//if friday---> thid is the 5th day of the week
		//if saturday----> this is the 6th day of the week
		//if sunday---> this is the 7nth day of the week
		
		String day="sunday";
		
		switch (day)
		{
		case " monday":System.out.println("this is the 1st day of the week");
			
			break;
		case "tuesday":System.out.println("thid is the 2nd day of the week");
      break;
		case "wednesday":System.out.println("this is the 3rd day of the week");
		break;
		case "thusday": System.out.println(" this is the 4th day of theb week");
		break;
		case "friday": System.out.println(" this is the 5th day of the week ");
		break;
		case " saturday": System.out.println("this is the 6th day of the week");
		break;
		case "sunday": System.out.println(" this is the 7nth day of the week");
		break;
		
		}
	}

}
