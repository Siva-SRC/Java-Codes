import java.util.Scanner;
public class Scrabble_score {
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		String str;
		int ans = 0;
		System.out.print("Enter the String : ");
		str = scan.nextLine();
		str = str.toUpperCase();
		char s[] = str.toCharArray();
		for(int i = 0;i<s.length;i++)
		{
			switch(s[i])
			{
			case 'Q': case 'Z': ans = ans+10;
			break;
			case 'J': case 'X': ans = ans+8;
			break;
			case 'K': ans = ans+5;
			case 'F': case 'H': case 'V': case 'W': case 'Y': ans = ans+4;
			break;
			case 'B': case 'C': case 'M': case 'P': ans = ans+3;
			break;
			case 'D': case 'G': ans = ans+2;
			break;
			default: ans = ans+1;
			break;			
			}
		}
		System.out.println("Scrabble Score = "+ans);
		
	}

}
