import java.util.*;
public class Collections_and_Lists_demo {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args)
	{
		
		System.out.println("Enter your choice :-\nFor Collection Press 1\nFor List Press 2");
		int choice = scan.nextInt();
		if(choice == 1)
			collection();
		else if(choice == 2)
			list();
		else
		{
			System.out.println("Invalid input...");
			System.exit(0);
		}
	}
	public static void collection()
	{
		Collection values = new ArrayList();
		System.out.println("Enter the no of elements : ");
		int n = scan.nextInt();
		int e;
		System.out.println("Enter the elements : ");
		for(int i = 0;i<n;i++)
		{
			System.out.print("Element "+(i+1)+" = ");
			e = scan.nextInt();
			values.add(e);
		}
		System.out.print("Enter the element to be added in the collection : ");
		e = scan.nextInt();
		values.add(e);
		System.out.println("After add :-");
		values.forEach(System.out::println);
		System.out.println("");
		System.out.print("Enter the element to be remove : ");
		e = scan.nextInt();
		values.remove(e);
		values.forEach(System.out::println);
		
	}
	public static void list()
	{
		List values = new ArrayList();
		System.out.println("Enter the no of elements : ");
		int n = scan.nextInt();
		int e,index;
		System.out.println("Enter the elements : ");
		for(int i = 0;i<n;i++)
		{
			System.out.print("Element "+(i+1)+" = ");
			e = scan.nextInt();
			values.add(e);
		}
		System.out.println("Before sort :-");
		values.forEach(System.out::println);
		System.out.println("After sort :-");
		Collections.sort(values);
		values.forEach(System.out::println);
		System.out.println("Enter the index and the element to be add :- ");
		System.out.println("Enter the index : ");
		index = scan.nextInt();
		System.out.println("Enter the element : ");
		e = scan.nextInt();
		values.add(index,e);
		System.out.println("After add at particular index : ");
		values.forEach(System.out::println);
	}

}
