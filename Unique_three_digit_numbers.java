/*
Write a Java program to create and display unique three-digit number using 1, 2, 3, 4. Also count how many three-digit numbers are there.
Expected Output

123                                                      
124                                                      
...                                            
                                                   
431                                                      
432                                                      
Total number of the three-digit-number is 24*/

import java.util.Scanner;
public class Unique_three_digit_numbers {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int a[] = new int[4];
		int i,r,temp,total = 0,key = 0;
		System.out.println("Enter the four numbers : ");
		for(i = 0;i<4;i++)
			a[i] = scan.nextInt();
		int large = a[0];
		for(i = 1;i<4;i++)
			if(a[i]>large)
				large = a[i];
		System.out.println("large = "+large);
		int count[] = new int[large+1];
		for(i = 100;i<999;i++)
		{
			for(int l = 0;l<large+1;l++)
				count[l] = 0;
			key = 0;
			temp = i;
			while(temp>0)
			{
				r = temp%10;
				for(int j = 0;j<4;j++)
				{
					if(r == a[j])
						count[r] += 1;
				}
				temp /= 10;
			}
			for(int m = 0;m<large+1;m++)
				if(count[m] == 1)
					key++;
			if(key == 3)
			{
				System.out.print(i+" ");
				total++;
			}
		}
		System.out.print("\nThere are totally "+total+" numbers are present.");
	}

}
