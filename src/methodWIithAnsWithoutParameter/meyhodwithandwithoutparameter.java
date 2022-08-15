package methodWIithAnsWithoutParameter;

public class meyhodwithandwithoutparameter {

	public static void main(String[] args) {
		studentInfo();//zero parameter (static)
		
		meyhodwithandwithoutparameter jb=new meyhodwithandwithoutparameter();// crete a object//with parameter tstic
		
		jb.studentInfo("mukesh", 26.5f, 'M', 67.9f, 5.4f, 25, 2021);
		jb.studentInfo("jyoti", 25, 'F', 42.7f, 5.3f, 32, 2020);
		jb.studentInfo("ajay", 25.7f, 'M', 70.4f, 5.3f, 13, 2022);

		

	}
public static void studentInfo()
{
  String name;
  float age;
  char gender;
  float weight;
  float height;
  int rollno;
  int passoutyear;
  
  name="mukesh";
  age=26.5f;
  gender='M';
  weight=65.9f;
  height=5.4f;
  rollno=25;
  passoutyear=2020;
  
  System.out.println("=======================================");
  System.out.println("my name is "+name);
  System.out.println("im "+age+" year old");
  System.out.println("my gender is "+gender);
  System.out.println("my weight is "+weight+" kg");
  System.out.println("my height is "+height+" feet");
  System.out.println("my rollnumber is "+rollno);
  System.out.println("my passout year is "+passoutyear);
  System.out.println("========================================");
}


public static void studentInfo(String name,float age,char gender,float weight,float height,int rollno,int passoutyear)
{
	System.out.println("=============================================");
	System.out.println("my name is "+name);
	System.out.println("i am "+age+" year old");
	System.out.println("my gender is "+gender);
	System.out.println(" my weight is "+weight+" kg");
	System.out.println("my height is "+height+" feet");
	System.out.println("my roll number is "+rollno);
	System.out.println("my passout year is "+passoutyear);
	System.out.println("===============================================");
	
	}
}
