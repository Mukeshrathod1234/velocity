package logical;

public class pattern_14 {

	public static void main(String[] args) {

int i,j;
for (i=6;i>=0;i--)                      //row
{
for(j=6;j>i;j--)                   //space
{
System.out.print(" ");
}
for (j=0;j<(2*i-1);j++)            //column
{
System.out.print("*");
}
System.out.println();
}

for (i=2;i<=6;i++)                       //row
{
for(j=5;j>=i;j--)                   //space
{
System.out.print(" ");
}
for (j=0;j<(2*i-1);j++)              //column
{
System.out.print("*");         
}
System.out.println();
}


	}

}
