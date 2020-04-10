import java.util.Scanner;
public class PerfectNum_Abundant_Deficient {
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
		else if(ans>num)
			System.out.println("Abundant Number!!!");
		else if(ans<num)
			System.out.println("Deficient Number!!!");
	}

}
