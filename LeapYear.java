import java.util.Scanner;
public class LeapYear {
	public static void main(String args[])
	{
		int year;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the year ");
		year = scan.nextInt();
		String str =  (year%400 == 0)?"Leap year!!!":(year%100 == 0)?"Not a Leap Year....":(year%4 == 0)?"Leap year!!!":"Not a Leap Year...";
		System.out.println(str);
	}

}
