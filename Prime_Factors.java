import java.util.Scanner;
public class Prime_Factors {
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int n,i,j,k = 0,ans = 1;
		int flag = 0;
		int count;
		System.out.print("Enter the number ");
		n = scan.nextInt();
		int number = n;
		int a[] = new int[n];
		for(i = 1;i<=n;i++)
		{
			count = 0;
			for(j = 1;j<=i;j++)
			{
				if(i%j == 0)
					count++;
			}
			if(count == 2)
				a[k++] = i;
		}
		System.out.print("Prime Factors are ");
		for(i = 0;i<k;)
			{
				if(n%a[i] == 0)
				{
					n = n/a[i];
					System.out.print(a[i]+" ");
					ans = ans*a[i];
					i = i;
				}
				else
				{
					i++;
				}
				if(ans == number)
				{
					System.exit(0);
				}		
		}
	}
}
