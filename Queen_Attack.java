import java.util.Scanner;
public class Queen_Attack {
	static Scanner scan = new Scanner(System.in);
	static int count = 0;
	public static void main(String[] args)
	{
		char chess[][] = getarray();
		int wq_row,wq_column,bq_row,bq_column;
		int i,j;
		for(i = 0;i<8;i++)
			for(j = 0;j<8;j++)
				chess[i][j] = '_';
		getchess(chess);
		System.out.println("Before queen's place choose ");
		System.out.println("Enter the queen's place:-");
		System.out.println("White Queen's position");
		System.out.print("Row = ");
		wq_row = scan.nextInt()-1;
		System.out.print("Column = ");
		wq_column = scan.nextInt()-1;
		chess[wq_row][wq_column] = 'W';
		System.out.println("Black Queen's position");
		System.out.print("Row = ");
		bq_row = scan.nextInt()-1;
		System.out.print("Column = ");
		bq_column = scan.nextInt()-1;
		chess[bq_row][bq_column] = 'B';
		getchess(chess);
		if(bq_row == 0 && bq_column == 0)
		{
			//System.out.println("in 1st loop");
			down(chess,bq_row,bq_column);
			right(chess,bq_row,bq_column);
			DRDiag(chess,bq_row,bq_column);
			System.out.println("Queen not get attack...");
		}
		else if(bq_row == 0 && bq_column == 7)
		{
			//System.out.println("in 2nd loop");
			left(chess,bq_row,bq_column);
			down(chess,bq_row,bq_column);
			DLDiag(chess,bq_row,bq_column);
			System.out.println("Queen not get attack...");
		}
		else if(bq_row == 7 && bq_column == 0)
		{
			//System.out.println("in 3rd loop");
			up(chess,bq_row,bq_column);
			right(chess,bq_row,bq_column);
			URDiag(chess,bq_row,bq_column);
			System.out.println("Queen not get attack...");
		}
		else if(bq_row == 7 && bq_column == 7)
		{
			//System.out.println("in 4th loop");
			up(chess,bq_row,bq_column);
			left(chess,bq_row,bq_column);
			ULDiag(chess,bq_row,bq_column);
			System.out.println("Queen not get attack...");
		}
		else
		{
			//System.out.println("in 5th loop");
			up(chess,bq_row,bq_column);
			down(chess,bq_row,bq_column);
			left(chess,bq_row,bq_column);
			right(chess,bq_row,bq_column);
			ULDiag(chess,bq_row,bq_column);
			URDiag(chess,bq_row,bq_column);
			DLDiag(chess,bq_row,bq_column);
			DRDiag(chess,bq_row,bq_column);
			System.out.println("Queen not get attack...");			
		}
	}
	public static char[][] getarray()
	{
		char chess[][] = new char[8][8];
		int i,j;
		for(i = 0;i<8;i++)
			for(j = 0;j<8;j++)
				chess[i][j] = '_';
		return chess;
	}
	public static void getchess(char chess[][])
	{
		int i,j;
		System.out.println("Chess Board :-");
		for(i = 0;i<8;i++)
		{
			for(j = 0;j<8;j++)
			{
				System.out.print(chess[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void up(char chess[][],int bq_row,int bq_column)
	{
		int i,j;
		int beg = bq_row;
		j = bq_column;
		//System.out.println("in up");
		for(i = beg;i>=0;i--)
		{
			if(chess[i][j] == 'W')
			{
				System.out.println(count++);
				System.out.println("Queen get attack !!!");
				System.exit(0);
			}
		}
	}
	public static void down(char chess[][],int bq_row,int bq_column)
	{
		int i,j;
		int beg = bq_row;
		j = bq_column;
		//System.out.println("in down");
		for(i = beg;i<8;i++)
		{
			if(chess[i][j] == 'W')
			{
				System.out.println("Queen get attack !!!");
				System.exit(0);
			}
		}
	}
	public static void left(char chess[][],int bq_row,int bq_column)
	{
		int i,j;
		i  = bq_row;
		int end = bq_column;
		//System.out.println("in left");
		for(j = end;j>=0;j--)
		{
			if(chess[i][j] == 'W')
			{
				System.out.println("Queen get attack !!!");
				System.exit(0);
			}
		}
	}
	public static void right(char chess[][],int bq_row,int bq_column)
	{
		int i,j;
		i  = bq_row;
		int end = bq_column;
		//System.out.println("in right");
		for(j = end;j<8;j++)
		{
			if(chess[i][j] == 'W')
			{
				System.out.println("Queen get attack !!!");
				System.exit(0);
			}
		}
	}
	public static void ULDiag(char chess[][],int bq_row,int bq_column)
	{
		int i,j;
		i = bq_row;
		j = bq_column;
		//System.out.println("in ULDiag");
		while(i != -1 || j != -1)
		{
			if(i == -1 || j == -1)
				break;
				if(chess[i][j] == 'W')
				{
					System.out.println("Queen get attack !!!");
					System.exit(0);
				}
				i--;
				j--;
		}
	}
	public static void DRDiag(char chess[][],int bq_row,int bq_column)
	{
		int i,j;
		i = bq_row;
		j = bq_column;
		//System.out.println("in DRDiag");
		while(i != 8 || j != 8)
		{
			if(i == 8|| j == 8)
				break;
				if(chess[i][j] == 'W')
				{
					System.out.println("Queen get attack !!!");
					System.exit(0);
				}
				i++;
				j++;
		}
	}
	public static void URDiag(char chess[][],int bq_row,int bq_column)
	{
		int i,j;
		i = bq_row;
		j = bq_column;
		//System.out.println("in URDiag");
		while(i != -1 || j != 8)
		{
			if(i == -1 || j == 8)
				break;
				if(chess[i][j] == 'W')
				{
					System.out.println("Queen get attack !!!");
					System.exit(0);
				}
				i--;
				j++;
		}
	}
	public static void DLDiag(char chess[][],int bq_row,int bq_column)
	{
		int i,j;
		i = bq_row;
		j = bq_column;
		//System.out.println("in DLDiag");
		while(i != 8 || j != -1)
		{
			if(i == 8 || j == -1)
				break;
				if(chess[i][j] == 'W')
				{
					System.out.println("Queen get attack !!!");
					System.exit(0);
				}
				i++;
				j--;
		}
	}
}
