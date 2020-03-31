import java.util.Scanner;
public class sort 
{
	public static void main(String args[])
	{
		int n,i,j,temp;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of the array ");
		n = scan.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the elements ");
		for(i=0;i<n;i++)
			a[i] = scan.nextInt();
		for(i=0;i<n;i++)
		{
			for(j=0;j<n-i-1;j++)
			{
				if(a[j]<a[j+1])
				{
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		for(i=0;i<n;i++)
			System.out.print(a[i]+" ");
		
	}

}
