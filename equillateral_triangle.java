import java.util.Scanner;
import java.lang.Math;
public class equillateral_triangle {
	public static void main(String args[])
	{
		int side;
		double area;
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the side of the triangle ");
		side = scan.nextInt();
		area = (Math.sqrt(3)/4)*side*side;
		System.out.println("The area of the equillateral triangle is "+area);
	}

}
