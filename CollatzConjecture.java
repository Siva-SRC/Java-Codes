import java.util.Scanner;
public class CollatzConjecture {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.print("Enter the number : ");
		int n = scan.nextInt();
		System.out.println("Collatz Conjecture Sequence :- ");
		System.out.println(n);
		collatz(n);
	}
	public static void collatz(int n)
	{
		boolean run=true;
		while(run)
		{
			if(n!=1)
			{
				if(n%2==0)
					n = n/2;
				else if(n%2==1)
					n = (3*n)+1;
				System.out.println(n);
			}
			else
			{
				run=false;
			}
		}
	}

}
