import java.util.Scanner;
import java.lang.Math;
public class Diamond {
	public static void main(String args[])
	{
		int i,j,k,key = 0;
		int range;
		Scanner scan = new Scanner(System.in);
		char c;
		char ans = 'A';
		System.out.print("Enter the Letter : ");
		c = scan.next().charAt(0);
		if(c>='a' && c<= 'z')
		{
			c = (char)(c - 32);
		}
		range = (int)(c - 65);
		int n = range;
		range = range*2+1;
		for(i = 0;i<range;i++)
		{
			for(j = 0;j<range;j++)
			{
				if(i+j == range/2 || i+j == range-1+(range/2) || i == j+(range/2) || j == i+(range/2))
					System.out.print(" "+ans+" ");
				else
					System.out.print(" . ");
			}
			System.out.println();
			if(i<range/2)
				ans++;
			else
				ans--;
		}
		
	}

}
