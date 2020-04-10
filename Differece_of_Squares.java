import java.util.Scanner;
import java.lang.Math;
public class Differece_of_Squares {
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int i,start,end,square_of_sum = 0,sum_of_squares = 0;
		System.out.println("Enter the range ");
		System.out.print("Starting point: ");
		start = scan.nextInt();
		System.out.print("Ending point: ");
		end = scan.nextInt();
		for(i = start;i<=end;i++)
			square_of_sum += i;
		square_of_sum = (int)Math.pow(square_of_sum,2);
		for(i = start;i<=end;i++)
			sum_of_squares += i*i;
		System.out.println("Square of Sum : "+square_of_sum);
		System.out.println("Sum of Squares : "+sum_of_squares);
		
		System.out.println("Difference of the squares is : "+(square_of_sum - sum_of_squares));
			
	}

}
