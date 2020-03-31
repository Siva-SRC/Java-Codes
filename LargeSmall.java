import java.util.Scanner;
public class LargeSmall {
	public static void main(String args[])
	{
		int size,temp;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array ");
		size = scan.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the elements ");
		for(int i = 0;i < size; i++)
			arr[i] = scan.nextInt();
		//for(int i = 0;i<size;i++)
			//System.out.print(arr[i]+" ");
		System.out.println();
		for(int i = 0;i<size;i++)
		{
			for(int j = 0;j<size-i-1;j++)
			{
				if(arr[j+1]>arr[j])
				{
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					
				}
			}
		}
		//for(int i = 0;i<size;i++)
			//System.out.print(arr[i]+" ");
		System.out.println("Largest number : "+arr[0]);
		System.out.println("Smallest number : "+arr[size-1]);
	}

}
