import java.util.Scanner;
public class Atbash_Cipher {
	static Scanner scan = new Scanner(System.in);
	static String abc = "abcdefghijklmnopqrstuvwxyz";
	static String zyx = "zyxwvutsrqponmlkjihgfedcba";
	static char[] abcd = abc.toCharArray();
	static char[] zyxw = zyx.toCharArray();
	public static void main(String [] args)
	{
		String string;
		System.out.println("Enter the string : ");
		string = scan.nextLine();
		char[] str = string.toCharArray();
		System.out.println("Enter you choice  :-");
		System.out.println("For plain to cipher (encode) Press 1\nFor cipher to plain (decode) Press 2\n");
		int choice = scan.nextInt();
		if(choice == 1)
			encode(str);
		else if(choice == 2)
			decode(str);
		else
			System.out.println("Invalid input...");
	}
	public static void encode(char[]str)
	{
		int i;
		String cipher = "";
		for(i = 0;i<str.length;i++)
		{
			if(str[i] == ' ')
				cipher += ' ';
			else if(Character.isAlphabetic(str[i]))
			{
				cipher += zyxw[str[i] - 97];
			}
		}
		System.out.println("Encoded = "+cipher);
	}
	public static void decode(char[]str)
	{
		int i;
		String plain = "";
		for(i = 0;i<str.length;i++)
		{
			if(str[i] == ' ')
				plain += ' ';
			else if(Character.isAlphabetic(str[i]))
			{
				plain += abcd[25-(str[i] - 97)];
			}
		}
		System.out.println("Decoded = "+plain);
	}
}
