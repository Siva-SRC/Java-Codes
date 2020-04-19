import java.util.Scanner;
public class First_non_repeating_char {
	public static void main(String args[])
	{
		int count = 0;
		Scanner scan = new Scanner(System.in);
		String string;
		System.out.println("Enter the string ");
		string = scan.nextLine();
		char [] str = string.toCharArray();
		for(int i = 0;i<str.length;i++)
		{
			count = 0;
			for(int j = i+1;j<str.length;j++)
			{	
				if(str[i] == str[j])
				{
					count++;
				}
			}
			if(count == 0)
			{
				System.out.println("The first non repeating character is "+str[i]);
				System.exit(0);
			}
		}
		System.out.println("There is no non repeating characters...");
	}
}
