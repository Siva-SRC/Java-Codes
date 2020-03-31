import java.util.Scanner;
public class TwoFer {
   public static void main(String[] kathir)
     {
       String name;
	   Scanner scan=new Scanner(System.in);
      System.out.print("Enter your Name : ");
      name=scan.nextLine();
      System.out.println(check(name)); 
     }
   static String check(String name)
       {
          if(name.equals("")) 
        	  return "One for you ,One for me";
          else
        	  return "One for "+name+" ,One for me";
       }  
     
  }