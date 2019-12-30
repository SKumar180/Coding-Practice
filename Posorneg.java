
import java.util.Scanner;
public class Num {

	public static void main(String[] args) 
    {
		int number;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number:");
        number = scan.nextInt();
        scan.close();
        if(number > 0)
        {
            System.out.println(number+" is positive number");
        }
        else if(number < 0)
        {
            System.out.println(number+" is negative number");
        }
        else
        {
            System.out.println(number+" is zero");
        }
    }
}

Output:-
Enter any number:-789
-789 is negative number
