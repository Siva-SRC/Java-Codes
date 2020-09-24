import java.util.Scanner;
public class Permutation {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		String string;
		System.out.print("Enter the string : ");
		string = scan.nextLine();
		int n = string.length();
		permute(string,0,n);
		factorial(string.length());
	}
	public static void permute(String string,int l,int r)
	{
		if(l==r)
		{
			System.out.println(string);
		}
		else
		{
			for(int i=l;i<r;i++)
			{
				string = swap(string,l,i);
				permute(string,l+1,r);
				string = swap(string,l,i);
			}
		}
	}
	public static String swap(String string,int i,int j)
	{
		char[] str = string.toCharArray();
		char temp;
		temp = str[i];
		str[i] = str[j];
		str[j] = temp;
		return String.valueOf(str);
	}
	public static void factorial(int n)
	{
		int ans = 1;
		for(int i=1;i<=n;i++)
		{
			ans *= i;
		}
		System.out.println("There are "+ans+" permutations...");
	}

}
