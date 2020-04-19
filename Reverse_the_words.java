import java.util.Scanner;
public class Reverse_the_words {
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		String string;
		String ans = "";
		System.out.println("Enter the string ");
		string = scan.nextLine();
		char [] str = string.toCharArray();
		int beg = 0;
		int end = str.length;
		System.out.println("Reverse of the given string is ");
		for(int i = str.length-1;i>=0;i--)
		{
			ans = "";
			if(str[i] == ' ' || i == 0)
			{
				if(i == 0)
				{
					beg = i;
					end = end+1;
				}
				else
					beg = i+1;
				for(int j = beg;j<end;j++)
					ans += str[j];
				System.out.print(ans+" ");
				end = i;
			}	
		}
	}

}
