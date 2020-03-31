import java.util.Scanner;
public class factorial {
	public static void main(String args[])
	{
		int ans = 1,num,i;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number ");
		num = scan.nextInt();
		for(i=1;i<=num;i++)
			ans = ans*i;
		System.out.println("The factorial of the "+num+" is "+ans);
	}

}
