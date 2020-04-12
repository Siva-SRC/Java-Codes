import java.util.Scanner;
public class Triangle {
	public static void main(String args[])
	{
		int s1,s2,s3;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the sides of the triangle :-");
		System.out.print("Side 1 : ");
		s1 = scan.nextInt();
		System.out.print("Side 2 : ");
		s2 = scan.nextInt();
		System.out.print("Side 3 : ");
		s3 = scan.nextInt();
		if(s1 == s2 && s1 == s3)
			System.out.println("Equilateral triangle");
		else if(s1 == s2 || s2 == s3 || s1 == s3)
			System.out.println("Isosceles triangle");
		else 
			System.out.println("Scalene triangle");
	}
}
