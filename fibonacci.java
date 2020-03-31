import java.util.Scanner;
public class fibonacci {
	public static void main(String args[])
	{
		int a = 0,b = 1,c,range;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the range ");
		range = scan.nextInt();
		System.out.println(a);
		System.out.println(b);
		for(int i = 0;i<range-2;i++)
		{
			c = a+b;
			System.out.println(c);
			a=b;
			b=c;
			
		}
		
	}
	

}
