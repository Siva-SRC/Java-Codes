/*
Input	:What is 5 plus 13 plus 6?
Output 	:Answer = 24

Input	:What is 3 plus 2 multiplied by 3?
Output	:15 (i.e. not 9)*/
import java.util.Scanner;
public class Wordy {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args)
	{
		int i,j;
		int m = 0,n = 1;
		String string;
		String number = "";
		int num;
		System.out.println("Enter your string : ");
		string = scan.nextLine();
		int a[] = new int[string.length()];
		int k = 0;
		int index[] = new int[string.length()];
		int l = 0;
		char[] str = string.toCharArray();
		int key;
		boolean run = true;
		for(i = 0;i<str.length;i++)
		{
			if(Character.isDigit(str[i])&& Character.isDigit(str[i+1]))
			{
				{
					key = i;
					for(j = key;j<str.length;j++)
					{
						if(str[j] == ' ' || j+1 == str.length)
							break;
						else
							number += str[j];								
					}
					i = j;
					index[l++] = j-1;
					num = Integer.parseInt(number);
					a[k++] = num;
					number = "";
				}
			}
			else if(str[i] >= '0' && str[i] <= '9')
			{
				a[k] = str[i] - 48;
				index[l++] = i;
				k++;
			}
		}
		int x = 0,y = 1;
		int ans = 0;
		while(true)
		{
			ans = operation(str,index[x],index[y],a,ans,m,n);
			x++;
			y++;
			m++;
			n++;
			if(x == l || y == l)
				break;
		}
		System.out.println("Answer = "+ans);
	}
	public static int operation(char str[],int beg,int end,int a[],int ans,int m,int n)
	{
		int i;
		String key = "";
		for(i = beg+1;i<end;i++)
		{
			if(str[i] == ' ' || !Character.isDigit(str[i]))
			key += str[i];
		}
		switch(key)
		{
		case " plus "		  : ans = a[m] + a[n];
								a[n] = ans;
								break;
		case " subtracted by ":	ans = a[m] - a[n];
								a[n] = ans;
								break;
		case " multiplied by ":	ans = a[m] * a[n];
								a[n] = ans;
								break;
		case " divided by ":	ans = a[m] / a[n];
								a[n] = ans;
								break;
		default: System.out.println("Invalid input...");
		System.exit(0);
		break;
		}
		return ans;
	}
}
