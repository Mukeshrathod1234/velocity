package globalandlocalveriable;

public class clnonstaticglobalveriable {

	public static void main(String[] args) {
		
		
		employee sachin=new employee();
		sachin.emp_name="sachin";
		sachin.emp_id="muk123";
		sachin.emp_sal=1.3400f;
		sachin.emp_age=26;
		
		employee virat=new employee();
		virat.emp_name="virat";
		virat.emp_id="muke1234";
		virat.emp_sal=13.5f;
		virat.emp_age=30;
		
		
		
		sachin.emp_info();
		virat.emp_info();

	}
	
	
}
