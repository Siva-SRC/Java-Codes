import java.util.Scanner;
public class Affine_Cipher {
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		String str;
		int i,x,y,k,key = 0,m = 26;
		boolean c = true;
		System.out.println("Affine Cipher\n");
		while(c)
		{
		System.out.println("Enter your choice:-");
		System.out.println("For Encryption Press 1\nFor Decryption Press 2");
		int choice = scan.nextInt();
		if(choice == 1)
		{
			System.out.println("\nEncryption\n");
			System.out.print("Enter the string : ");
			str = input.nextLine();
			str = str.toUpperCase();
			System.out.print("Enter the value of A : ");
			int a = scan.nextInt();
			System.out.print("Enter the value of B : ");
			int b = scan.nextInt();
			char[] s = str.toCharArray();
			int e[] = new int[s.length];
			k = 0;
			//formula for encryption: E(x) = (ax + b) mod m here m = 26
			for(i = 0;i<s.length;i++)
			{
				if(s[i] == ' ')
				{
					e[k++] = ' '; 
					continue;
				}
				x = (int)(s[i]-65);
				e[k++] = ((a*x)+b)%26;
			}
			for(i = 0;i<e.length;i++)
			{
				if(e[i] == ' ' )
				{
					System.out.print((char)e[i]);
					continue;
				}
				System.out.print((char)(e[i]+65));
			}
			System.out.println("\nTo Continue Press 1\nTo exit Press 2");
			int choice1 = scan.nextInt();
			if(choice1 == 1)
				c = true;
			else if(choice1 == 2)
				c = false;
			else
			{
				System.out.println("Invalid input...");
				System.exit(0);
			}

		}
		else if (choice == 2)
		{
			System.out.println("\nDecryption\n");
			System.out.print("Enter the string : ");
			str = input.nextLine();
			str = str.toUpperCase();
			System.out.print("Enter the value of A : ");
			int a = scan.nextInt();
			System.out.print("Enter the value of B : ");
			int b = scan.nextInt();
			char[] s = str.toCharArray();
			int d[] = new int[s.length];
			k = 0;
			a = a%26;
			//formula for decryption: D(y) = a^-1(y - b) mod m here m = 26
			for(i = 1;i<=26;i++)
			{
				if((a*i)%26 == 1)
				{
					key = i;
					break;
				}
				
			}
			if(key == 0)
			{
				System.out.println("A and B are not a co-prime...");
			}
			else
			{
			for(i = 0;i<s.length;i++)
			{
				if(s[i] == ' ')
				{	
					d[k++] = ' ';
					continue;
				}
				y = (int)(s[i]-65);
				d[k++] = key*(y-b)%26;
				if(d[k-1]<0)						//for negative value add 26 
					d[k-1] += m;					
			}
			for(i = 0;i<d.length;i++)
			{
				if(d[i] == ' ')
				{
					System.out.print((char)d[i]);
					continue;
				}
				System.out.print((char)(d[i]+65));
			}
			}
			System.out.println("\nTo Continue Press 1\nTo exit Press 2");
			int choice1 = scan.nextInt();
			if(choice1 == 1)
				c = true;
			else if(choice1 == 2)
				c = false;
			else
			{
				System.out.println("Invalid input...");
				System.exit(0);
			}

		}
		else
		{
			System.out.println("Invalid input...");
			System.out.println("To Continue Press 1\nTo exit Press 2");
			int choice1 = scan.nextInt();
			if(choice1 == 1)
				c = true;
			else if(choice1 == 2)
				c = false;
			else
			{
				System.out.println("More than one invalid inputs you have entered...");
				System.exit(0);
			}
		}
		}
	}

}
