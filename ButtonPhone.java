import java.util.Scanner;
public class ButtonPhone {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int i,j,index;
        String[] alphabets = {".,","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"," "};
        char[] numbers = {'1','2','3','4','5','6','7','8','9','0'};
        String string,keyword="";
        System.out.println("Enter the string : ");
        string = scan.nextLine().toLowerCase();
        char[] str = string.toCharArray();
        for(i=0;i<str.length;i++)
        {
            for(j=0;j<alphabets.length;j++)
            {
                keyword = alphabets[j];
                char[] key = keyword.toCharArray();
                for(int m=0;m<key.length;m++)
                {
                    if (str[i] == key[m])
                    {
                        index = m;
                        printnumbers(index, j, numbers);
                    }
                }
            }
        }
    }
    public static void printnumbers(int index,int j,char[] numbers)
    {
        for(int i=0;i<index+1;i++)
        {
            if((j+1)==10)
                System.out.print(0);
            else
                System.out.print(j+1);
        }
        System.out.println();
    }
}
