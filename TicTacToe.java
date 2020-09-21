import java.util.Scanner;
public class TicTacToe {
	static Scanner scan = new Scanner(System.in);
	public static void  main(String[] args)
	{
		char arr[][] = new char [3][3];
		String a[][] = new String [3][3];
		int i,j;
		System.out.println("<-----------{ TicTacToe Game }---------->");
		System.out.println("Entry must be x or o .");
		System.out.println("Player 1 is x\nPlayer 2 is o\n");
		System.out.println("Positions:- ");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(i+""+j+" ");
			}
			System.out.println();
		}
		for(i=0;i<3;i++)
			for(j=0;j<3;j++) 
				arr[i][j] = '-';
		print(arr);
		entry(arr);
	}
	public static void entry(char arr[][])
	{
		int i,j,row,column;
		char sym[] = new char [9];
		System.out.println("\nEnter your symbol x or o with row and column : ");
		for(i=0;i<9;i++)
		{
			System.out.print("Row : ");
			row = scan.nextInt();
			System.out.print("Column :");
			column = scan.nextInt();
			System.out.print("Symbol : ");
			sym[i] = scan.next().charAt(0);
			if(i%2==0 && (sym[i]=='o' || sym[i]=='O'))
			{
				System.out.println("It must be x ...");
				i--;
			}
			else
			{
				if(arr[row][column] == '-')
				{
					arr[row][column] = sym[i];
					print(arr);
					check(arr);
				}
				else
				{
					System.out.println("Already filled with "+arr[row][column]+". \nTry another position.");
					i--;
				}
			}
		}
		System.out.println("Out of moves...");
		System.exit(0);
	}
	public static void check(char arr[][])
	{
		if((((arr[0][0] == arr[1][1] && arr[0][0] == arr[2][2])||(arr[0][0] == arr[0][1] && arr[0][0] == arr[0][2])||(arr[0][0] == arr[1][0] && arr[0][0] == arr[2][0])) && (arr[0][0] == 'x' || arr[0][0] == 'X'))||(((arr[0][2] == arr[1][1] && arr[0][2] == arr[2][0])||(arr[0][2] == arr[1][2] && arr[0][2] == arr[2][2])) && (arr[0][2] == 'x' || arr[0][2] == 'X'))||((arr[2][0] == arr[2][1] && arr[2][0] == arr[2][2]) && arr[2][0] == 'x' || arr[2][0] == 'X'))
		{
			System.out.println("\nX wins");
			System.exit(0);
		}
		else if ((((arr[0][0] == arr[1][1] && arr[0][0] == arr[2][2])||(arr[0][0] == arr[0][1] && arr[0][0] == arr[0][2])||(arr[0][0] == arr[1][0] && arr[0][0] == arr[2][0])) && (arr[0][0] == 'o' || arr[0][0] == 'O'))||(((arr[0][2] == arr[1][1] && arr[0][2] == arr[2][0])||(arr[0][2] == arr[1][2] && arr[0][2] == arr[2][2])) && (arr[0][2] == 'o' || arr[0][2] == 'O'))||((arr[2][0] == arr[2][1] && arr[2][0] == arr[2][2]) && arr[2][0] == 'o' || arr[2][0] == 'O'))
		{
			System.out.println("\nO wins");
			System.exit(0);
		}
	}
	public static void print(char arr[][])
	{
		int i,j;
		System.out.println("\nTicTacToe:-");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
