import java.util.Scanner; //import Statement

public class ex_03
{
	public static void main(String[]args)
	{
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompt for user input3
		System.out.println("So we're gonna calculate the area of the traingle. What is the height of the triangle? ");
		
		int height = keyboard.nextInt();
		System.out.println( height + " Okay. What is the base of the triangle? ");
		
		int base = keyboard.nextInt();
		System.out.println( base + " Okay. Let me calculate the area of the traingle. ");
		
		int areaTri =( height * base )/2;
		System.out.println( "The area of the triangle is " + areaTri );
		
	}
}