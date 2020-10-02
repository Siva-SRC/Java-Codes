import java.util.Scanner;
import java.io.*;
public class Grep {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int i, j;
        String string;
        File file = new File("//home//admin-pc//Desktop//JavaFileHandlingDemo//grepdemo.txt");  //enter your filepath
        boolean present = file.exists();
        if (present == true)
        {
            FileReader fReader = new FileReader(file);
            BufferedReader bReader = new BufferedReader(fReader);
            System.out.println("Enter the String : ");
            string = scan.nextLine();
            String line = bReader.readLine();
            while (line != null) {
                String[] words = line.split(" ");
                for (i = 0; i < words.length; i++)
                {
                    if (string.equals(words[i]) || string.equals(words[i] + "."))
                        System.out.println(line);
                }
                line = bReader.readLine();
            }
        }
        else
            System.out.println("File doesn't exists...");
    }
}
