package logical;

public class pattern_4 {

	public static void main(String[] args) {
		int i,j,k;
		for ( i=5;i>=1;i--)                   //row
		{
		for (j=i;j<5;j++)                 //space
		{

		System.out.print(" ");
		}
		for ( k=1;k<=i;k++)               //column
		{
		System.out.print("*");
		}
		System.out.println();
		}


	}

}
