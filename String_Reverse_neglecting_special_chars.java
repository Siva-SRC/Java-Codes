import java.util.Scanner;
public class String_Reverse_neglecting_special_chars {
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		String string;
		System.out.print("Enter the string : ");
		string = scan.nextLine();
		char str[] = string.toCharArray();
		char  i,j,temp = ' ';
		int beg = 0;
		int end = str.length - 1;
		while(beg < end)
		{	
			if(!(Character.isAlphabetic(str[beg])))
			{
				beg++;
				continue;
			}
			if(!(Character.isAlphabetic(str[end])))
			{
				end--;
				continue;
			}
			temp = str[beg];
			str[beg] = str[end];
			str[end] = temp;
			beg++;
			end--;
		}
		System.out.print("The reversed string is ");
		for(i = 0;i<str.length;i++)
			System.out.print(str[i]);
	}
	

}
