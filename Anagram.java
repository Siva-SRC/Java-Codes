import java.util.Scanner;
public class Anagram {
	public static void main(String args[])
	{
		int i,j,length1,length2,count = 0;
		String string1;
		String string2;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String 1 : ");
		string1 = scan.nextLine();
		char str1[] = string1.toCharArray();
		length1 = str1.length;
		System.out.println("Enter the String 2: ");
		string2 = scan.nextLine();
		char str2[] = string2.toCharArray();
		length2 = str2.length;
		char temp = 0;
		if(length1 == length2)
		{			
		for(i = 0;i<length1;i++)
		{
			for(j = 0;j<length1-i-1;j++)
			{
				if(str1[j]>str1[j+1])
				{
					temp = str1[j+1];
					str1[j+1] = str1[j];
					str1[j] = temp;
				}
				if(str2[j]>str2[j+1])
				{
					temp = str2[j+1];
					str2[j+1] = str2[j];
					str2[j] = temp;
				}
			}
		}
		}
		else
		{
			System.out.println("Non-Anagram, string length must be equal...");
			System.exit(0);
		}
		for(i = 0;i<length1;i++)
		{
			if(str1[i] == str2[i])
				count++;
		}
		if(count == length1)
			System.out.println("Anagram!!!");
		else
			System.out.println("Non-Anagram...");
	}

}
