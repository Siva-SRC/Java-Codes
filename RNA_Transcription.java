import java.util.Scanner;
public class RNA_Transcription {
	public static void main(String args[])
	{
		int length;
		String RNA = "";
		String DNA;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the DNA ");
		DNA = scan.next();
		length = DNA.length();
		for(int i=0;i<length;i++)
		{
			if(DNA.charAt(i)=='C')
				RNA = RNA + 'G';
			if(DNA.charAt(i)=='G')
				RNA = RNA + 'C';
			if(DNA.charAt(i)=='A')
				RNA = RNA + 'U';
			if(DNA.charAt(i)=='T')
				RNA = RNA + 'A';
		}
		System.out.println("The RNA transcription for the given DNA ( "+DNA+" ) is "+RNA);
	}

}
