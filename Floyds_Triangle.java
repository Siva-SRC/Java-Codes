import java.util.Scanner;
public class Floyds_Triangle {
	public static void main(String args[])
	{
		int i,j,space;
		int row;
		int num = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no of rows ");
		row = scan.nextInt();
		space = row;
		for(i = 0;i<row;i++)
		{
			for(j = 0;j<=i;j++)
				System.out.print(++num+" ");
			System.out.println();
			space--;	
		}
	}

}