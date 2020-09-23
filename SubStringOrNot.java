import java.util.Scanner;
public class SubStringOrNot {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int i,j;
		String string1,string2;
		System.out.println("Enter the Main string : ");
		string1 = scan.nextLine();
		char[] str1 = string1.toCharArray();
		System.out.println("Enter the string to be checked : ");
		string2 = scan.nextLine();
		char[] str2 = string2.toCharArray();
		for(i=0;i<str1.length;i++)
		{
			if(str2[0] == str1[i])
			{
				substringcheck(str1,str2,i);
			}
		}
		System.out.println("Not a Substring...");
	}
	public static void substringcheck(char[] s1,char[] s2,int index)
	{
		int i,k=0,count=0;
		System.out.println("index = "+index);
		for(i=index;i<s1.length;i++)
		{
			if(k<s2.length)
			{
				if(s1[i]==s2[k])
				{
					k++;
					count++;
				}
				else
				{
					break;
				}
			}
		}
		if(count==s2.length)
		{
			System.out.println("Substring");
			System.exit(0);
		}
	}

}
