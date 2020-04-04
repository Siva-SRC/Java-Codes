import java.util.Scanner;
public class Acronym {
	public static void main(String args[])
	{
		int i,length;
		String string;
		String ans = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String ");
		string = scan.nextLine();
		char str[] = string.toCharArray();
		length = str.length;
		str[0] = (char)((int)str[0]-32);
		ans += str[0];
		for(i = 0;i<length;i++)
		{
			if(str[i] == ' ')
			{
				if(str[i+1]>='a'&&str[i+1]<='z')
				{
					str[i+1] = (char)((int)str[i+1] - 32);
					ans = ans+str[i+1];
				}
			}
		}
		System.out.println(ans);
	}

}
