import java.util.Scanner;
public class Saddle_Points {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args)
	{
		int i,j,row,column;
		int rs,cl;
		int saddle = 0;
		int k = 0;
		System.out.println("Enter the no of rows and column of the matrix :-");
		System.out.print("Row : ");
		row = scan.nextInt();
		System.out.print("Column : ");
		column = scan.nextInt();
		int a[][] = new int[row][column];
		if(row != column)
		{
			System.out.println("The row and column mus be equal...");
			System.exit(0);
		}
		int beg1,end1;
		int beg2,end2;
		System.out.println("Enter the elements : ");
		for(i = 0;i<row;i++)
		{
			for(j = 0;j<column;j++)
			{
				a[i][j] = scan.nextInt();
			}
		}
		System.out.println("Matrix:");
		for(i = 0;i<row;i++)
		{
			for(j = 0;j<column;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Saddle points:");
		for(i = 0;i<row;i++)
		{
			rs = a[i][0];
			beg1 = i;
			end1 = 0;
			for(j = 0;j<column;j++)
			{
				if(a[i][j]<rs)
				{
					rs = a[i][j];
					beg1 = i;
					end1 = j;
				}
			}
			cl = a[0][end1];
			beg2 = 0;
			end2 = end1;
			for(int m = 0;m<column;m++)
			{
				if(a[m][end1]>cl)
				{
					cl = a[m][end1];
					beg2 = m;
					end2 = end1;
				}
			}
			if(rs == cl)
			{
				System.out.println("("+beg1+","+end1+")");
			}
		}
		for(i = 0;i<row;i++)
		{
			rs = a[i][0];
			beg1 = i;
			end1 = 0;
			for(j = 0;j<column;j++)
			{
				if(a[i][j]>rs)
				{
					rs = a[i][j];
					beg1 = i;
					end1 = j;
				}
			}
			cl = a[0][end1];
			beg2 = 0;
			end2 = end1;
			for(int m = 0;m<column;m++)
			{
				if(a[m][end1]<cl)
				{
					cl = a[m][end1];
					beg2 = m;
					end2 = end1;
				}
			}
			if(rs == cl)
			{
				System.out.println("("+beg1+","+end1+")");
			}
		}
	}
}
