import java.util.Scanner;
public class Decimal_to_Roman {
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int n, beg, end, d;
		int decimal[] = {1,5,10,50,100,500,1000};
		char roman[] = {'I','V','X','L','C','D','M'};
		System.out.print("Enter the Decimal number : ");
		n = scan.nextInt();
		if(n<0)
		{
			System.out.println("You entered a negative number!\n");
		}
		else if(n == 0)
		{
			System.out.println("You entered Zero or Nulla!\n");
		}
		else if(n >= 4000)
		{
			System.out.println("This code has a limit from 1 to 3999.\n");
		}
		else
		{
			System.out.print("The Roman number is ");
			while(n>0){
				//find limit
				for(beg = 6; beg > 0; beg--){
					if(n >= decimal[beg]){
						break;
					}
				}

				for(end = 0; end < 7; end++){
					if(n <= decimal[end]){
						break;
					}
				}
				//get left most digit in n
				d = n;
				while(d != 0)
				{
					d = d / 10;
					if(d < 10)
					{
						break;
					}
				}
				//print roman numeral
				if(n<10 && n==4)
				{
					System.out.print(roman[beg]+""+roman[end]);
					n=0;
				}
				else if(n>10 && d==4)
				{
					System.out.print(roman[beg]+""+ roman[end]);
					n = n - (decimal[end] - decimal[beg]);
				}
				else if(n<10 && n==9)
				{
					System.out.print(roman[beg - 1]+""+ roman[end]);
					n=0;
				}
				else if(n>10 && d==9)
				{
					System.out.print(roman[beg - 1]+""+ roman[end]);
					n = n - (decimal[end] - decimal[beg - 1]);
				}
				else
				{
					System.out.print(roman[beg]);
					n = n - decimal[beg];
				}
			}
		}
	}

}
