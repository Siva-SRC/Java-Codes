import java.util.Scanner;
public class Series {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args)
	{
		String string;
		int digit;
		System.out.println("Enter the string : ");
		string = scan.nextLine();
		char [] str = string.toCharArray();
		System.out.println("Enter the no of digit series : ");
		digit = scan.nextInt();
		System.out.println(digit+" digit series :-");
		series(str,digit);
	}
	public static void series(char[] str,int digit)
	{
		int i,j,flag = 0;
		String ans = "";
		for(i = 0;i<str.length;i++)
		{
			for(j = i;j<i+digit;j++)
			{
				ans += str[j];
				if(j == str.length-1)
					flag = 1;
			}
			System.out.println(ans);
			ans = "";
			if(flag == 1)
				break;
		}
	}

}
