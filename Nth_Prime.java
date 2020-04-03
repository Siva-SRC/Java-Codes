import java.util.Scanner;
public class Nth_Prime {
	public static void main(String args[])
	{
		int i,n,num = 1,count = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the nth value ");
		n = scan.nextInt();
		while(count<n)
		{
			num = num+1;
			for(i = 2;i<=num;i++)
			{
				if(num%i == 0)
					break;
			}
			if(i == num)
				count = count+1;
			
		}
		System.out.println("The value of the nthe prime is "+num);
		
	}

}
