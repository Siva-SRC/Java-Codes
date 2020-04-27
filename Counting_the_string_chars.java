import java.util.Scanner;
public class Counting_the_string_chars {
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		String string;
		int i,letters = 0,numbers = 0,spaces = 0,special = 0;
		System.out.println("Enter the string : ");
		string = scan.nextLine();
		char str[] = string.toCharArray();
		for(i = 0;i<str.length;i++)
		{
			if(str[i]>='A'&&str[i]<='Z'||str[i]>='a'&&str[i]<='z')
				letters++;
			else if(str[i]>='0'&&str[i]<='9')
				numbers++;
			else if(str[i] == ' ')
				spaces++;
			else
				special++;
		}
		System.out.println("Letters : "+letters+"\nNumbers : "+numbers+"\nSpaces : "+spaces+"\nSpecial Characters : "+special);
	}

}
