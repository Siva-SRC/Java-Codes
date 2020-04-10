import java.util.Scanner;
public class Pascals_Triangle {
	public static void main(String args[])
	{
		int i,j;
		int num = 1;
		int row;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the no fo rows you want ");
		row = scan.nextInt();
		int space = row;
		for(i = 0;i<row;i++)
		{
			for(int s = 0;s<space;s++)			//loop for spaces
			{
				System.out.print(" ");
			}
			num = 1;
			for(j=0;j<=i;j++)					//loop for print numbers
			{
				System.out.print(num+" ");
				num = num*(i-j)/(j+1);			//formula to find the in between number
			}
			space--;
			System.out.println();
		}
	}

}
