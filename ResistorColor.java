import java.util.Scanner;
public class ResistorColor {
	public static void main(String args[])
	{
		int code = 0;
		String color;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the color ");
		color = scan.nextLine();
		switch(color)
		{
		case "black": code = 0;
		System.out.println("The color code of the "+ color + " is "+ code);
		break;
		
		case "brown": code = 1;
		System.out.println("The color code of the "+ color + " is "+ code);
		break;
		
		case "red" : code = 2;
		System.out.println("The color code of the "+ color + " is "+ code);
		break;
		
		case "orange" : code = 3;
		System.out.println("The color code of the "+ color + " is "+ code);
		break;
		
		case "yellow" : code = 4;
		System.out.println("The color code of the "+ color + " is "+ code);
		break;
		
		case "green" : code = 5;
		System.out.println("The color code of the "+ color + " is "+ code);
		break;
		
		case "blue" : code = 6;
		System.out.println("The color code of the "+ color + " is "+ code);
		break;
		
		case "violet" : code = 7;
		System.out.println("The color code of the "+ color + " is "+ code);
		break;
		
		case "grey" : code = 8;
		System.out.println("The color code of the "+ color + " is "+ code);
		break;
		
		case "white" : code = 9;
		System.out.println("The color code of the "+ color + " is "+ code);
		break;
		
		default: System.out.println("Invalid input!!!");
		break;
		}
	}
}