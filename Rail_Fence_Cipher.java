import java.util.Scanner;
public class Rail_Fence_Cipher {
	static Scanner scan = new Scanner(System.in);
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args)
	{
		int choice;
		System.out.println("Enter your choice\nFor plain to cipher Press 1\nFor cipher to plain Press 2");
		choice = scan.nextInt();
		if(choice == 1)
			plaintocipher();
		else if(choice == 2)
			ciphertoplain();
		else
		{
			System.out.println("Invalid input...");
			System.exit(0);
		}
	}
	public static void plaintocipher()
	{
		String string;
		boolean run = true;
		int i,j,key,k;
		System.out.println("Enter your plain text : ");
		string = input.nextLine();
		char str[] = string.toCharArray();
		char[][] a = new char[3][str.length];
		for(i = 0;i<3;i++)
			for(j = 0;j<str.length;j++)
				a[i][j] = '.';
		i = 0;
		j = 0;
		k = 0;
		key = 0;
		while(run)
		{
			a[i][j++] = str[k++];
			if(k == str.length)
				break;
			if(i == 0)
				key = 1;
			else if(i == 2)
				key = 0;
			if(key == 1)
				i++;
			else if(key == 0)
				i--;
			
		}
		System.out.println("Cipher text:-");
		for(i = 0;i<3;i++)
		{
			for(j = 0;j<str.length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void ciphertoplain()
	{
		int i,j,k,key;
		int len;
		System.out.println("Enter the length of the string : ");
		len = scan.nextInt();
		char[][] a = new char[3][len];
		System.out.println("Enter the elements :-\nFor space put '_' :");
		
		for(i = 0;i<3;i++)
			for(j = 0;j<len;j++)
			{
				a[i][j] = input.next().charAt(0);
				if(a[i][j] == '_')
					a[i][j] = ' ';
			}
		System.out.println("Your Cipher text:-");
		for(i = 0;i<3;i++)
		{
			for(j = 0;j<len;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		i = 0;
		j = 0;
		k = 0;
		key = 0;
		System.out.println("Plain text:-");
		while(true)
		{
			if(j == len)
				break;
			System.out.print(a[i][j++]);
			if(i == 0)
				key = 1;
			else if(i == 2)
				key = 0;
			if(key == 1)
				i++;
			else if(key == 0)
				i--;
			k++;
		}
		
	}

}
