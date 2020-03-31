import java.util.Scanner;
class student
{
	String name;
	String mail;
	String dept;
	int reg_no;
	double cgpa;
	long mobile;
	public void display()
	{
		System.out.println("Student name : "+name);
		System.out.println("Reg_no : "+reg_no);
		System.out.println("Department : "+dept);
		System.out.println("CGPA : "+cgpa);
		System.out.println("Mail ID : "+mail);
		System.out.println("Contact number : "+mobile);
	}
	
}
public class StudentDetails {
	public static void main(String args[])
	{
		student s = new student();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the name : ");
		s.name = scan.next();
		System.out.println("Enter the Reg no : ");
		s.reg_no = scan.nextInt();
		System.out.println("Enter your department : ");
		s.dept = scan.next();
		System.out.println("Enter your CGPA : ");
		s.cgpa = scan.nextDouble();
		System.out.println("Enter the email id : ");
		s.mail = scan.next();
		System.out.println("Enter the Contact number : ");
		s.mobile = scan.nextLong();
		s.display();		
	}

}
