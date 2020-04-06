/*Example for Square matrix:[ 9   3   22  16  15
  							  2   21  20  14   8
 							  25  19  13   7   1
 							  18  12   6   5  24
 							  11  10   4  23  17 ]*/
import java.util.Scanner;
public class MagicSquare_Matrix {
	public static void main(String args[])
	{
		int row,column,i,j,sum_row = 0,sum_column = 0;
		int k = 0,l = 0,m = 0;
		int key;
		int diag_sum = 0;
		int anti_diag_sum = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no of rows ");
		row = scan.nextInt();
		System.out.println("Enter the no of columns ");
		column = scan.nextInt();
		int row_sum[] = new int [row];
		int column_sum[] = new int[column];
		int arr[][] = new int[row][column];
		if(row == column)
		{
			System.out.println("Enter the elements of the matrix : ");
			for(i = 0;i<row;i++)
				for(j = 0;j<column;j++)
					arr[i][j] = scan.nextInt();
		for(i = 0;i<row;i++)
		{
			for(j = 0;j<column;j++)
			{
				sum_row += arr[i][j];
				sum_column += arr[j][i];
				if(i == j)
					diag_sum += arr[i][j];
				if(i+j == row-1)
					anti_diag_sum += arr[i][j];
			}
			row_sum[k] += sum_row;
			column_sum[k] += sum_column; 
			k++;
		}
		key = row_sum[0];
		if(key == diag_sum && key == anti_diag_sum)
		{
			for(i = 0;i<row;i++)
			{
				if(key == row_sum[i] && key == column_sum[i])
				{
					System.out.println("Magic Square Matrix!!!");
				}
			}
			System.out.println("Sum = "+key);
		}
		
		else
			System.out.println("Non_Magic Square Matrix...");
		}
		else
			System.out.println("Non-Magic Square Matrix, because no of rows and columns are not equal...");
		
				
	}

}
