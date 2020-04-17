import java.util.Scanner;
import java.lang.Math;
public class All_Your_base {
	public static void main (String args[])
	{
		Scanner scan = new Scanner(System.in);
		int n,i = 0,k = 0,r,base,ans = 0;
		System.out.print("Enter the Number : ");
		n = scan.nextInt();
		System.out.print("Enter the Base value : ");
		base = scan.nextInt();
		int[] a= new int [n/2];
		while(n != 0)
		{
			r = n % 10;
			ans = ans + r*(int)(Math.pow(base, i++));
			n = n/10;
		}
		System.out.print("The answer is "+ ans);
	}

}
