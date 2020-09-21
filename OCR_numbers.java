import java.util.Scanner;
public class OCR_numbers {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args)
	{
		int i;
		System.out.println("Enter your number to be converted into OCR : ");
		String number = scan.next();
		char num[] = number.toCharArray();
		for(i=0;i<num.length;i++)
			if(!(Character.isDigit(num[i])))
			{
				System.out.println("Invalid input... All inputs must be an integer...");
				System.exit(0);
			}
		for(i=0;i<num.length;i++)
			ocr_converter(num[i]);
	}
	public static void ocr_converter(char n)
	{
		if(n=='0')
			System.out.println(" __ \n|  |\n|  |\n|__|\n");
		else if(n=='1')
			System.out.println("/|\n |\n |\n_|_\n");
		else if(n=='2')
			System.out.println("__\n  |\n__|\n|\n|__\n");
		else if(n=='3')
			System.out.println("__\n  |\n__|\n  |\n__|\n");
		else if(n=='4')
			System.out.println("|  |\n|__|\n   |\n   |\n");
		else if(n=='5')
			System.out.println(" __\n|\n|__\n   |\n __|\n");
		else if(n=='6')
			System.out.println(" __\n|\n|__\n|  |\n|__|\n");
		else if(n=='7')
			System.out.println("__\n  |\n  |\n  |\n  |\n");
		else if(n=='8')
			System.out.println(" __ \n|  |\n|__|\n|  |\n|__|\n");
		else if(n=='9')
			System.out.println(" __ \n|  |\n|__|\n   |\n __|\n");
		else
		{
			System.out.println("Invalid input!!!");
			System.exit(0);
		}
	}

}
