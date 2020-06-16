import java.util.Scanner;
public class Rotaional_Cipher {
	static Scanner scan = new Scanner(System.in);
	public static void main(String [] args)
	{
		String alpha = "abcdefghijklmnopqrstuvwxyz";
		char[] a = alpha.toCharArray();
		String ALPHA = alpha.toUpperCase();
		char[] A = ALPHA.toCharArray();
		String string;
		int choice,rot;
		System.out.println("Enter the string : ");
		string = scan.nextLine();
		char[] str = string.toCharArray();
		System.out.println("Enter the ROT number : ");
		rot = scan.nextInt();
		System.out.println("For Plain to Cipher Press 1\nFor Cipher to Plain Press 2");
		choice = scan.nextInt();
		if(choice == 1)
			System.out.println(plaintocipher(str,a,A,rot));
		else if(choice == 2)
			System.out.println(ciphertoplain(str,a,A,rot));
		else
		{
			System.out.println("Invalid input...");
			System.exit(0);
		}
		
	}
	public static String plaintocipher(char[]str,char[] a,char[] A,int rot)
	{
		String answer = "";
		int num = 0;
		for(int i = 0;i<str.length;i++)
		{
			if(str[i] == ' ')
				answer += " "; 
			else if(!Character.isAlphabetic(str[i]))
				answer += str[i];
			else if(Character.isAlphabetic(str[i]))
			{
				if(Character.isLowerCase(str[i]))
				{
					num = str[i]-97;
					num += rot;
					if(num>25)
						num = num-26;
					answer += a[num];
				}
				else if(Character.isUpperCase(str[i]))
				{
					num = str[i]-65;
					num += rot;
					if(num>25)
						num = num-26;
					answer += A[num];
				}
			}
		}
		return answer;
	}
	public static String ciphertoplain(char[]str,char[] a,char[] A,int rot)
	{
		String answer = "";
		int num = 0;
		for(int i = 0;i<str.length;i++)
		{
			if(str[i] == ' ')
				answer += " "; 
			else if(!Character.isAlphabetic(str[i]))
				answer += str[i];
			else if(Character.isAlphabetic(str[i]))
			{
				if(Character.isLowerCase(str[i]))
				{
					num = str[i]-97;
					num -= rot;
					if(num<0)
						num = num+26;
					answer += a[num];
				}
				else if(Character.isUpperCase(str[i]))
				{
					num = str[i]-65;
					num -= rot;
					if(num<0)
						num = num+26;
					answer += A[num];
				}
			}
		}
		return answer;
	}

}
