//Example: 4539 1488 0343 6467
import java.util.Scanner;
public class Luhn {
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		String number;
		int i,ans = 0;
		System.out.println("Enter your 16 digits credit card number : ");
		number = scan.next();
		if(number.length() == 16)
		{
		char num[] = number.toCharArray(); 
		int n[] = new int[number.length()];
		for(i = 0;i<number.length();i++)
			n[i] = (int)(num[i]-48);
		for(i = 0;i<number.length();i+=2)
		{
			n[i] *= 2;
			if(n[i]>9)
				n[i] -= 9;
		}
		for(i = 0;i<number.length();i++)
			ans += n[i];
		if(ans%10 == 0)
			System.out.println("Valid credit card number!!!");
		else
			System.out.println("Invalid credit card number...");
		}
		else
			System.out.println("The credit card number you have entered does not have exactly 16 numbers. Please check your number.");
	}

}
