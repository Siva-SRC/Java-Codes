//Example ISBN 10 code: 3598215088
import java.util.Scanner;
public class ISBN_10_verification {
	public static void main(String args[])
	{
		long isbn_num,r,ans = 0;
		int i = 1;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the 10 digits ISBN number : ");
		isbn_num = scan.nextLong();
		while(isbn_num>0)
		{
			r = isbn_num%10;
			ans = ans+r*i;
			i++;
			isbn_num = isbn_num/10;
		}
		if(ans%11 == 0 && i==11)
			System.out.println("Valid ISBN 10 code !!! ");
		else if(i != 11)
			System.out.println("The code does not have exactly 10 digits. Please check the no of digits is equal to 10.");
		else 
			System.out.println("Invalid ISBN 10 code...");
	}

}
