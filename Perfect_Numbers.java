import java.util.Scanner;
public class Perfect_Numbers {
	public static void main(String args[])
	{
		int num,i,ans = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to be checked ");
		num = scan.nextInt();
		for(i = 1;i<num;i++)
			if(num%i == 0)
				ans = ans+i;
		if(ans == num)
			System.out.println("Perfect Number!!!");
		else
			System.out.println("Non-Perfect Number...");
	}

}
