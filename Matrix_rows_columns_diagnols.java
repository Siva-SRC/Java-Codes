import java.util.Scanner;
public class Matrix_rows_columns_diagnols {
	public static void main(String args[])
	{
		int row,column,i,j;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the no of rows : ");
		row = scan.nextInt();
		System.out.print("Enter the no of columns : ");
		column = scan.nextInt();
		int a[][] = new int[row][column];
		for(i = 0;i<row;i++)
			for(j = 0;j<column;j++)
				a[i][j] = scan.nextInt();
		System.out.println("Rows : ");
		for(i = 0;i<row;i++)
		{
			for(j = 0;j<column;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}		
		System.out.println("Columns : ");
		for(i = 0;i<column;i++)
		{
			for(j = 0;j<row;j++)
			{
				System.out.print(a[j][i]+" ");
			}
			System.out.println();
		}	
		if(row == column)
		{
		System.out.println("Diagnols : ");
		for(i = 0;i<row;i++)
		{
			for(j = 0;j<column;j++)
			{
				if(i == j)
				System.out.print(a[i][j]+" ");
			}
		}		
		System.out.println();
		for(i = 0;i<row;i++)
		{
			for(j = 0;j<column;j++)
			{
				if(i+j == row-1)
				System.out.print(a[i][j]+" ");
			}
		}		
		}
		else
			System.out.println("No of rows not equal to no of columns, So there is no diagnols...");
	}
}
