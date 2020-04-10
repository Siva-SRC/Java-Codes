import java.util.Scanner;
public class sum_of_multiples {
	public static void main(String args[])
	{
		int start,end;
		int multi1,multi2;
		int ans = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the range :-");
		System.out.print("Starting point : ");
		start = scan.nextInt();
		System.out.print("Ending point : ");
		end = scan.nextInt();
		System.out.print("Enter the multiple number 1 :");
		multi1 = scan.nextInt();
		System.out.print("Enter the multiple number 2 :");
		multi2 = scan.nextInt();
		for(int i = start;i<end;i++)
			if(i%multi1 == 0 || i%multi2 == 0)
				ans += i;
		System.out.print("The sum of multiples of "+multi1+" and "+multi2+" is "+ans);
	}

}
