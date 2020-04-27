import java.util.Scanner;
public class Exception_Handling {
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		int a,b,ans = 0;
		try
		{
			System.out.println("Enter the teo numbers to be divided :-");
			System.out.print("Enter the value of A : ");
			a = scan.nextInt();
			System.out.print("Enter the value of B : ");
			b = scan.nextInt();
			ans = a/b;
		}
		catch(Exception e)
		{
			System.out.println("Error : "+e);
		}
		finally
		{
			System.out.println("Answer : "+ans);
			System.out.println("Excecution Finished...");
		}
	}

}
