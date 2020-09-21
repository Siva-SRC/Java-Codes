import java.util.Scanner;
public class Isogram {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args)
	{
		String string;
		System.out.println("Enter the string : ");
		string = scan.nextLine();
		char[] str = string.toCharArray();
		IsogramCheck(str);
	}
	public static void IsogramCheck(char str[])
	{
		int i,j,count=0;
		for(i=0;i<str.length;i++)
		{
			for(j=i+1;j<str.length;j++)
			{
				if(str[i] == str[j])
				{
					count++;
					if(count!=0)
						break;
				}
			}
		}
		if(count==0)
			System.out.println("Isogram!!!");
		else
			System.out.println("Not an Isogram...");
	}

}
