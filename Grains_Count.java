import java.util.Scanner;
import java.math.BigInteger;
public class Grains_Count {
	public static void main(String args[])
	{
		int i,n;
		BigInteger ans = new BigInteger("2");
		Scanner  scan = new Scanner(System.in);
		System.out.println("Enter the nth square ");
		n = scan.nextInt();
		for(i=0;i<n;i++)
			ans = ans.multiply(new BigInteger("2"));
		System.out.println("The answer is "+ans);
		
	}

}
