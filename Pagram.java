//Example for Pangram: THE QUICK BROWN FOX JUMPS OVER A LAZY DOG
import java.util.Scanner;
public class Pagram {
	public static void main(String args[])
	{
		int i,size,index;
		String string;
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER THE STRING IN UPPER-CASE");
		System.out.print("Enter the String : ");
		string = scan.nextLine();
		string = string.replace(" ", "");
		char str[] = string.toCharArray();
		size = str.length;
		int a[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		i = 0;
		while(i!=size)
		{
			index = str[i]-65;
			a[index] = 1;
			++i;
		}
		i = 0;
		while(i!=26)
		{
			if(a[i]==1)
			{
				++i;
			}
			else
			{
				System.out.println("Non-Pangram...");
				System.exit(0);
			}
		}
		System.out.println("Pangram!!!");
		
	}

}
