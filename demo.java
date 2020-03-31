import java.util.Scanner;
public class demo {
	public static void main (String args[])
	{
		String a;
		char temp;
		int l,i,j;
		System.out.print("Enter your name ");
		Scanner scan = new Scanner(System.in);
		a = scan.nextLine();
		l = a.length();
		System.out.println("Name : "+ a);
		System.out.print("String length :"+ l);
		for(i=0;i<l;i++)
		{
			for(j=0;j<l-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		System.out.print("Sorted string : "+ a);
		
	}

}
