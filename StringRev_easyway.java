import java.util.Scanner;
public class StringRev_easyway {
	public static void main(String args[])
	{
		String original;
		String reverse;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the String to be reversed ");
		original = scan.nextLine();
		StringBuffer sb = new StringBuffer(original);
		reverse = sb.reverse().toString();
		System.out.println("The reversed string is "+reverse);
	}

}
