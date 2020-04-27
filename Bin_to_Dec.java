import java.util.Scanner;
import java.lang.Math;
public class Bin_to_Dec {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n,i = 0,r,ans = 0;
		System.out.print("Enter the binary number : ");
		n = scan.nextInt();
		while(n>0)
		{
			r = n%10;
			ans += r*Math.pow(2, i);
			i++;
			n /= 10;
		}
		System.out.print("The decimal number is "+ans);
		
	}

}
