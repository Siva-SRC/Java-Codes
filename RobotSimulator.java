import java.util.Scanner;
public class RobotSimulator {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String string;
		String direction;
		int i,j,count = 1;
		int no_of_R = 0,no_of_L = 0;
		System.out.print("Enter the Instruction (for example : Left, Advance, Advance, Right, Advance, Right = LAARAR)  : ");
		string = scan.nextLine();
		string = string.toUpperCase();
		char str[] = string.toCharArray();
		System.out.print("Enter the facing direction (for example: North or East or West or South) : ");
		direction = scan.nextLine();
		direction = direction.toUpperCase();
		System.out.println("Moving directions:-");
		for(i = 0;i<str.length;i++)
		{
			if(i+1 == str.length && str[str.length-1] != str[str.length-2])
			{
				System.out.print(movements(str,i,count)+" "+count+" times.\n");
				continue;
			}
			if(str[i] != str[i+1] || i==str.length-1)
			{
				System.out.print(movements(str,i,count)+" "+count+" times.\n");
				count = 1;
			}
			else if(str[i] == str[i+1] || i==str.length-1)
			{
				for(j = i;j<str.length-1;j++)
				{
					if(str[j] == str[j+1] && j<str.length)
					{
						count++;
					}
					else if(str[j] != str[j+1])
					{
						break;
					}
				}
				System.out.print(movements(str,i,count)+" "+count+" times.\n");
				i = j;
				count = 1;
			}
		}
		for(i = 0;i<str.length;i++)
		{
			if(str[i] == 'R')
				no_of_R++;
			else if(str[i] == 'L')
				no_of_L++;
		}
		System.out.println();
		String dir = "";
		if(no_of_R == no_of_L || no_of_R == 0 && no_of_L%4 == 0 || no_of_L == 0 && no_of_R%4 == 0)
		{
			System.out.println("Final Facing Direction : "+direction);
		}
		else if(no_of_R>no_of_L)
		{
			dir = "right";
			System.out.println("Final Facing Direction : "+ facing_direction(direction,dir));
		}
		else if(no_of_L>no_of_R)
		{
			dir = "left";
			System.out.println("Final Facing Direction : "+ facing_direction(direction,dir));
		}
	}
	//to find the movements
	public static String movements(char str[],int i,int count)
	{
		String move = " ";
		switch(str[i])
		{
			case 'R': move = "--> Turn Right ";
			break;
			
			case 'L': move = "--> Turn Left ";
			break;
			
			case 'A': move = "--> Advance ";
			break;
		}
		return move;
	}
	//to find the facing direction 
	public static String facing_direction(String direction,String dir)
	{
		String facing = "";
		if ((direction.contentEquals("NORTH") || direction.contentEquals("N"))&&dir.contentEquals("right"))
		{
			facing = "East";
		}
		else if ((direction.contentEquals("NORTH") || direction.contentEquals("N"))&&dir.contentEquals("left"))
		{
			facing = "West";
		}
		else if ((direction.contentEquals("SOUTH") || direction.contentEquals("S"))&&dir.contentEquals("right"))
		{
			facing = "West";
		}
		else if ((direction.contentEquals("SOUTH") || direction.contentEquals("S"))&&dir.contentEquals("left"))
		{
			facing = "East";
		}
		else if ((direction.contentEquals("EAST") || direction.contentEquals("E"))&&dir.contentEquals("right"))
		{
			facing = "South";
		}
		else if ((direction.contentEquals("EAST") || direction.contentEquals("E"))&&dir.contentEquals("left"))
		{
			facing = "North";
		}
		else if ((direction.contentEquals("WEST") || direction.contentEquals("W"))&&dir.contentEquals("right"))
		{
			facing = "North";
		}
		else if ((direction.contentEquals("WEST") || direction.contentEquals("W"))&&dir.contentEquals("left"))
		{
			facing = "South";
		}
		return facing;
	}

}
