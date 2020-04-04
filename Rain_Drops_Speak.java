import java.util.Scanner;
public class Rain_Drops_Speak {
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int num,i,j = 0,size;
		String str = "";
		System.out.println("Enter the number ");
		num = scan.nextInt();
		int[] arr = new int[num];
		for(i = 1;i<num;i++)
		{
			if(num%i == 0)
			{
				arr[j] = i; 
				j++;
			}
		}
		size = arr.length;
		for(i = 0;i<size;i++)
		{
			if(arr[i] == 3)
				str = str+"Pling";
			else if(arr[i] == 5)
				str = str+"Plang";
			else if(arr[i] == 7)
				str = str+"Plong";
		}
		System.out.println("If the RainDrops speak, it would be "+str);
	}

}
