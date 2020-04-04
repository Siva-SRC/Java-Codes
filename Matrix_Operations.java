import java.util.Scanner;
public class Matrix_Operations {
	public static void main(String args[])
	{
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the no of rows of the 1st matrix ");
		int row1 = scan.nextInt();
		System.out.print("Enter the no fo columns of the 1st matrix ");
		int column1 = scan.nextInt();
		System.out.println("Enter the elements of the 1st matrix:");
		int[][] a= new int[row1][column1];
		for(int i = 0;i<row1;i++)
			for(int j = 0;j<column1;j++)
				a[i][j] = scan.nextInt();
		System.out.print("Enter the no of rows of the 2nd matrix ");
		int row2 = scan.nextInt();
		System.out.print("Enter the no fo columns of the 2nd matrix ");
		int column2 = scan.nextInt();
		System.out.println("Enter the elements of the 2nd matrix: ");
		int[][] b = new int[row2][column2];
		for(int i = 0;i<row2;i++)
			for(int j = 0;j<column2;j++)
				b[i][j] = scan.nextInt();
		if(row2 == column1)
		{
			int[][] add = new int [row1][column2];
			for(int i = 0;i<row1;i++)
				for(int j = 0;j<column2;j++)
				{
					add[i][j] = a[i][j]+b[i][j];
				}
			System.out.println("Addition:");
			for(int i = 0;i<row1;i++)
			{
				for(int j = 0;j<column2;j++)
				{
					System.out.print(add[i][j]+" ");
				}
				System.out.println();
			}
			int[][] sub = new int [row1][column2];
			for(int i = 0;i<row1;i++)
				for(int j = 0;j<column2;j++)
				{
					sub[i][j] = a[i][j]-b[i][j];
				}
			System.out.println("Subtraction:");
			for(int i = 0;i<row1;i++)
			{
				for(int j = 0;j<column2;j++)
				{
					System.out.print(sub[i][j]+" ");
				}
				System.out.println();
			}int[][] mul = new int [row1][column2];
			for(int i = 0;i<row1;i++)
				for(int j = 0;j<column2;j++)
					for(int k = 0;k<row2;k++)
					{
						mul[i][j] = mul[i][j]+a[i][k]*b[k][j];
					}
			System.out.println("Multiplication:");
			for(int i = 0;i<row1;i++)
			{
				for(int j = 0;j<column2;j++)
				{
					System.out.print(mul[i][j]+" ");
				}
				System.out.println();
			}
		}
		else
		{
			System.out.println("Matrix operations does not exist...");
			System.exit(0);
		}
	}

}
