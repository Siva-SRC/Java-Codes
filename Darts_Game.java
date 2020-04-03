import java.util.Scanner;
import java.lang.Math;
public class Darts_Game {
	public static void main(String args[])
	{
		double x,y;
		int point;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the coordinates");
		x = scan.nextDouble();
		y = scan.nextDouble();
		double d = Math.sqrt((x*x) + (y*y));//d = distance from the centre i.e);origin
		if(d<=1)
		{
				point = 10;
				System.out.println("Your point is "+point);
		}
		else if(d>1&&d<=5)
		{
				point = 5;
				System.out.println("Your point is "+point);
		}
		else if(d>5&&d<=10)
		{
				point = 1;
				System.out.println("Your point is "+point);
		}	
		
	}

}
