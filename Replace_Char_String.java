public class Replace_Char_String {
	public static void main(String args[])
	{
		
		String str = "Test string having Symbols @#$%& Numbers 12345 spaces     ";
		str = str.replaceAll("Symbols", "Numbers");
		System.out.println(str);
		str = str.replaceAll(" ","0");
		System.out.println(str);
		str = str.replaceAll("[a-zA-Z]","1" );
		System.out.println(str);
		str = str.replaceAll("[0-9]", " ");
		System.out.println(str);
		str = str.replaceAll("[^a-zA-Z0-9]"," ");//here the remaining symbols also replaced by space so all are space
		System.out.println(str);
		System.out.println("The above line is full of spaces .... This line for your reference...");
	
	}

}
