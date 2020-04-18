import java.util.Scanner;
public class Word_Count {
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		String string;
		int i,j,k = 0,index = 0,end = 0,f = 1;
		System.out.print("Enter the string ");
		string = scan.nextLine();
		char str[] = string.toCharArray();
		int length = string.length();
		String s = "";
		String ans[] = new String[length];
		for(i = 0;i<length;i++)
		{
			if(str[i] == ' '||i == length-1)
			{
				end = i;
				if(i == length-1)
					end = i+1;
				for(j = k;j<end;j++)
					s = s + str[j];
				ans[index++] = s;
				s = "";
				k = j+1;
			}
		}
		end = 0;
		int freq[] = new int [index];
		for(i = 0;i<index;i++)
		{
			freq[i] = f;
			for(j = i+1;j<index;j++)
			{
				if(ans[i].contentEquals(ans[j]))
				{
					freq[i] += 1;
					ans[j] = "0000";
				}
			}
			if(ans[i].contentEquals("0000"))
				continue;
			else
				System.out.println(ans[i]+" present "+freq[i]+" times.");
		}
		
	}

}
