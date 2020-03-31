import java.util.Scanner;
public class string_rev {
	public static void main(String args[])
	{
		int i,length;
		String original;
		String reverse = "";
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the String to be reversed ");
		original = scan.nextLine();
		length = original.length();
		for(i = length-1;i>=0;i--)
			reverse += original.charAt(i);
		System.out.print("The reversed string is "+reverse);
	}

}
