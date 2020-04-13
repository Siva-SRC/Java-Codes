/*
 * Example:-
 * Input	: +1 (613)-995-0253
 * Output	: 6139950253
 * 
 * Note:-
 * The input must be in North American Numbering Plan (i.e)if you enter the country code,  then the country code should be in +1. 
 */
import java.util.Scanner;
public class Phone_Number {
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int i,length;
		String num,phone = "";
		System.out.print("Enter your Phone number : ");
		num = scan.nextLine();
		char no[] = num.toCharArray();
		length = no.length;			
		if(no[0] == '+' && no[1] == '1')
			{
				no[0] = ' ';
				no[1] = ' ';
			}
		if(no[0] == '1')
			no[0] = ' ';
		for(i = 0;i<length;i++)
			if(no[i]>='a'&&no[i]<='z' || no[i]>='A'&&no[i]<='Z')
			{
				System.out.println("Invalid input...");
				System.exit(0);
			}
			else if(no[i]<'0'||no[i]>'9')
				no[i] = ' ';
		for(i = 0;i<length;i++)	
			if(no[i] != ' ' || no[i]>= '0'&&no[i]<='9')
				phone = phone + no[i];
		System.out.println("Phone number :" + phone);	
	}

}
