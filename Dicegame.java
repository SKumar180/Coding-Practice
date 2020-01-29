import java.util.Scanner;
import java.text.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double amount;
        System.out.println("Enter the amount you are entering the game with:");
        amount=sc.nextDouble();
    
        if(amount<1000)
        {
           System.out.println("You cannot enter the game with this money");
            System.exit(0);  
        }
        double amt=amount;
        char ch;
            do{
         System.out.println("Value of dice");
        int diceval=sc.nextInt();
        if(diceval<1||diceval>6)
        {
           System.out.println("Invalid value");
          System.out.println("Please enter a valid value");
          System.out.println("Value of dice");
          diceval=sc.nextInt();
        }
           
        else if(diceval==1)
            {
              amt=(double)amt/2;
              break;
            }
            amt=(double)amt+(diceval*100);
            System.out.println("Do you continue[y or n]?");
            ch=sc.next().charAt(0);
               }while(ch=='y');
        DecimalFormat decimalFormat=new DecimalFormat("#,###.##");
        System.out.println("Amount received while leaving the game "+decimalFormat.format(amt));
        
    }
}
