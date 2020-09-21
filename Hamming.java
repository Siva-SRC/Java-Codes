/*
 * GAGCCTACTAACGGGAT
 * CATCGTAATGACGGCCT
 */
import java.util.Scanner;
public class Hamming {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[]args)
	{
		int i,count = 0;
		String string1,string2;
		System.out.println("String only contains A,C,G,T");
		System.out.println("Enter String1 :");
		string1 = scan.nextLine();
		char[] str1 = string1.toCharArray();
		System.out.println("Enter String2 : ");
		string2 = scan.nextLine();
		char[] str2 = string2.toCharArray();
		if(str1.length != str2.length)
		{
			System.out.println("The length of the two strings must be same");
			System.exit(0);
		}
		for(i=0;i<str1.length;i++)
		{
			if(str1[i]!='A' && str1[i]!='C' && str1[i]!='G' && str1[i]!='T' && str2[i]!='A' && str2[i]!='C' && str2[i]!='G' && str2[i]!='T')
			{
				count++;
			}
		}
		if(count!=0)
		{
			System.out.println("Characters must be in A,C,G,T");
			System.exit(0);
		}
		hamming(str1,str2);
	}
	public static void hamming(char[]str1,char[]str2)
	{
		int count = 0;
		for(int i=0;i<str1.length;i++)
		{
			if(str1[i] != str2[i])
			{
				count++;
			}
		}
		System.out.println("Hamming distance is "+count);
	}

}
