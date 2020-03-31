import java.util.Scanner;
public class circle {
	public static void main(String args[])
	{
		int radius;
		double area,perimeter;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the radius of the circle ");
		radius = scan.nextInt();
		area = 3.142*radius*radius;
		System.out.println("The area of circle is "+area);
		perimeter = 2*3.142*radius;
		System.out.println("The perimeter of the circle is "+perimeter);
		
	}

}
