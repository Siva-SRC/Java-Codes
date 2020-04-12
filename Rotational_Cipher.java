import java.util.Scanner;
public class Rotational_Cipher {
	public static void main(String args[])
	{
		String str = "";
		Scanner scan = new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your choice :-");
		System.out.println("For Normal to Cipher Press 1.\nFor Cipher to Normal Press 2.");
		int choice = scan.nextInt();
		if(choice == 1)
		{
			System.out.print("Enter your String : ");
			str = input.nextLine();
			char s[] = str.toCharArray();
			for(int i = 0;i<s.length;i++)
			{
				if(s[i]>= 'a' && s[i]<= 'm' || s[i]>= 'A' && s[i]<= 'M')
				{
					s[i] = (char)(s[i] + 13);
				}
				else if(s[i]>= 'l' && s[i]<= 'z' || s[i]>= 'L' && s[i]<= 'Z')
				{
					s[i] = (char)(s[i] - 13);
				}
			}
			System.out.println(s);
		}
		else if(choice == 2)
		{
			System.out.print("Enter your String : ");
			str = input.nextLine();
			char s[] = str.toCharArray();
			for(int i = 0;i<s.length;i++)
			{
				if(s[i]>= 'n' && s[i]<= 'z' || s[i]>= 'L' && s[i]<= 'Z')
				{
					s[i] = (char)(s[i] - 13);
				}
				else if(s[i]>= 'a' && s[i]<= 'm' || s[i]>= 'A' && s[i]<= 'M')
				{
					s[i] = (char)(s[i] + 13);
				}
			}
			System.out.println(s);
		}
		else
			System.out.println("Invalid input...");
	}

}
