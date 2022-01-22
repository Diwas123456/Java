import java.util.Scanner;
public class Age {
public static void main(String arg[])
{
	Scanner sc = new Scanner(System.in);
	int Positivenumber =-1;
	while(Positivenumber<0)
	{
		System.out.println("Enter the Positive Number:");
		String input = sc.nextLine();
		try {
			Positivenumber = Integer.valueOf(input);
		}
		catch(NumberFormatException e)
		{
			Positivenumber = -1;
			System.out.println("only positive integer");
		}
	}
	sc.close();
	System.out.println("Your correct entred positrive number  is  " +Positivenumber);
}
}
