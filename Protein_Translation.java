import java.util.Scanner;
public class Protein_Translation {
	public static void main(String args[]) 
	{
		int i,k = 0,l = 0;
		String str;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the RNA : ");
		str = scan.next();
		str = str.toLowerCase();
		int size = str.length();
		if(size%3 == 0)
		{
		String t = "";
		char s[] = str.toCharArray();
		String string[] = new String[size/3];
		String ans[] = new String[size/3];
		for(i = 0;i<str.length();i++)
		{
			 t = t+s[i];
			 l++;
			 if(l%3 == 0)
			 {
				 string[k] = t;
				 k++;
				 t = "";
			 }
		}
		k = 0;
		for(i = 0;i<size/3;i++)
		{
			switch(string[i])
			{
			case "aug": ans[k] = "Methionine";
			k++;
			break;
			case "uuu": case "uug" : ans[k] = "Phenylalanine";
			k++;
			break;
			case "ucu" : case "ucc" : case "uca" : case "ucg" : ans[k] = "Serine";
			k++;
			break;
			case "uau" : case "uac" : ans[k] = "Tyrosine";
			k++;
			break;
			case "ugu" : case "ugc" : ans[k] = "Cysteine";
			k++;
			break;
			case "ugg" : ans[k] = "Tryptophan";
			k++;
			break;
			case "uaa" : case "uag" : case "uga" : ans[k] = "STOP";
			k++;
			break;
			default: System.out.println("The RNA you entered is Invalid...");
			System.exit(0);
			break;
			}
		}
		System.out.print("The Protein Translation is { ");
		for(i = 0;i<size/3;i++)
		{
			System.out.print(ans[i]+" ");
		}
		System.out.println(" }");
		}
		else
		{
			System.out.println("The RNA you entered is incorrect...");
			System.exit(0);
		}
	}
}
