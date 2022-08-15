package array;

public class multidimentionalArray {

	public static void main(String[] args) {
		//array declaration
		int a[][]=new int[2][2];
		a[0][0]=1;
		a[0][1]=2;
		a[1][0]=3;
		a[1][1]=4;
		
		//usage with simple printing statment
		System.out.print(a[0][0]+" ");
		System.out.println(a[0][1]);
		System.out.print(a[1][0]+" ");
		System.out.println(a[1][1]);
		System.out.println("==============");
		
		//usge with the help of for loop
		
		for(int i=0;i<=1;i++)
		{
			for(int j=0;j<=1;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
			
		}

	}

}
