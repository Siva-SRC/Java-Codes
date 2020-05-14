import java.util.Scanner;
public class String_move_uppercase_to_right {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String string;
		System.out.println("Enter the string : ");
		string = scan.nextLine();
		char[] str = string.toCharArray();
		String lower = "";
		String upper = "";
		int index = 0;
		for(int i = 0;i<str.length;i++) 
		{
			if(str[i] >= 'a' && str[i] <= 'z')
				lower += str[i];
			if(str[i] >= 'A' && str[i] <= 'Z')
				upper += str[i];
			if(str[i] == ' ')
				index++;
		}
		int indices[] = new int[index];
		int k = 0;
		System.out.println("spaces = "+index);
		for(int i = 0;i<str.length;i++)
			if(str[i] == ' ' && k != index)
				indices[k++] = i;
		String key = lower+upper;
		char[] Key = key.toCharArray();
		char [] ans = new char[str.length];
		k = 0;
		int l = 0;
		for(int i = 0;i<index;i++)
			System.out.println(indices[i]);
		System.out.println("ans length = "+ans.length);
		for(int i = 0;i<str.length;i++)
		{
			System.out.println("i = "+i+" k = "+k);
			System.out.println("indices[k] = "+indices[k]);
			if(i == indices[k] && k < indices.length)
			{
				ans[i] = ' ';
				if(k+1 != indices.length)
					k++;
				//else
					//k = k;
				continue;
			}
			
			if(l == key.length())
				break;
			ans[i] = Key[l++];
			
		}
		System.out.println(ans);		
		
	}

}
