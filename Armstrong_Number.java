import java.util.Scanner;
import java.lang.Math;
public class Armstrong_Number {
	public static void main(String args[])
	{
		int num,i,rem,temp,length = 0;
		double ans = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to be checked ");
		num = scan.nextInt();
		temp = num;
		while(num>0)
		{
			length++;
			num = num/10;
		}
		num = temp;
		while(num>0)
		{
			rem = num%10;
			ans = ans + Math.pow(rem, length);
			num = num/10;
		}
		if(ans == temp)
			System.out.println("Armstrong number!!!");
		else
			System.out.println("Not an Armstrong number...");
		
	}

}
