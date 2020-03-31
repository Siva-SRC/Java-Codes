import java.util.Scanner;
public class Large_Small {
	public static void main(String args[])
	{
		int i,large,small,n,temp;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array ");
		n = scan.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the elements ");
		for(i=0;i<n;i++)
			a[i] = scan.nextInt();
		large = a[0];
		for(i = 0;i<n;i++)
		{
			if(a[i]>large)
			{
				temp = a[i];
				a[i] = large;
				large = temp;
			}
		}
		small = a[0];
		for(i = 0;i<n;i++)
		{
			if(a[i]<small)
			{
				temp = a[i];
				a[i] = small;
				small = temp;
			}
		}
		System.out.println("Largest number : "+large);
		System.out.println("Smallest number : "+small);
	}

}
