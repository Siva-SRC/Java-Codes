import java.util.Scanner;
class add
{
	int num1,num2,ans;
	public int addition()
	{
		ans = num1+num2;
		return ans;
	}
}
public class CandO_add {
	public static void main(String args[])
	{
		add a = new add();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the 1st number ");
		a.num1 = scan.nextInt();
		System.out.println("Enter the 2nd number ");
		a.num2 = scan.nextInt();
		a.addition();
		System.out.println("The addition of the two given numbers is "+a.ans);
		
	}

	
}
