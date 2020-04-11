import java.util.Scanner;
public class FLAMES_FunGame {
	public static void main(String args[])
	{
		int i,j,count;
		int length1,length2,key,index = -1;
		Scanner scan = new Scanner(System.in);
		String name1;
		String name2;
		System.out.print("Enter the name of the first person	: 	");
		name1 = scan.nextLine();
		char n1[] = name1.toCharArray();
		length1 = name1.length();
		System.out.print("Enter the name of the second person	: 	");
		name2 = scan.nextLine();
		char n2[] = name2.toCharArray();
		length2 = name2.length();
		key = length1 + length2;
		for(i = 0;i<length1;i++)	//loop to cancel the same letters and find the no of remaining letters
			for(j = 0;j<length2;j++)
				if(n1[i] == n2[j])
				{
					n1[i] = n2[j] = ' ';
					key -= 2;
					break;
				}
		String f = "flames";
		for(i=0;i<5;i++)			//loop to find the relationship
		{
			for(j=0;j<key;j++)
			{
				index++;
				if(index>=f.length())
				{
					index = 0;
				}
			}
			if(index == 0)
			{
				f = f.substring(index+1,f.length());
				index = -1;
			}
			else
			{
				f = f.substring(0,index)+f.substring(index+1,f.length());
				index--;
			}
		}
		switch(f)
		{
		case "f":System.out.println("Friendship");
		break;
		case "l":System.out.println("Love");
		break;
		case "a":System.out.println("Affection");
		break;
		case "m":System.out.println("Marriage");
		break;
		case "e":System.out.println("Enemy");
		break;
		case "s":System.out.println("Sister");
		break;
		default:break;		
		}
	}
}
