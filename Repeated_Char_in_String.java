import java.util.Scanner;
public class Repeated_Char_in_String {
	public static void main(String args[])
	{
		int count = 0;
		String ans = "";
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String string = scan.nextLine();
		char[] str = string.toCharArray();
		int key[] = new int[str.length];
		for(int i = 0;i<str.length;i++)
		{
			for(int j = i+1;j<str.length;j++)
			{
				if(str[i] == str[j])
				{
					key[i] += 1;
					key[j] = 0;
				}
			}
			if(key[i] == 1)
				ans = ans + str[i]+" ";
			else if(key[i] == 0)
				count++;
			if(count == str.length)
			{
				System.out.print("There is no repeated characters...");
				System.exit(0);
			}
			
		}
		System.out.print("Repeated characters are  "+ans);
		
	}

}
