import java.util.Scanner;
public class Transpose_the_matrix {
	public static void main(String args[])
	{
		int row,column;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the no of rows : ");
		row = scan.nextInt();
		System.out.print("Enter the no of columns : ");
		column = scan.nextInt();
		String a[][] = new String[row][column];
		System.out.println("Enter the elements : ");
		for(int i = 0;i<row;i++)
			for(int j = 0;j<column;j++)
				a[i][j] = scan.next();
		System.out.println("Transpose Matrix :-");
		for(int i = 0;i<column;i++)
		{
			for(int j = 0;j<row;j++)
				System.out.print(a[j][i]+" ");
			System.out.println();
		}
	}

}
