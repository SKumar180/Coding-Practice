import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of lost team's coins left on board");
        int coinleft=sc.nextInt();
        int score=0;
        if(coinleft<1 || coinleft>9)
        {
            System.out.println("Invalid Input");
        }
        else
        {
            System.out.println("Has winning team pocketed red [y or n] ?");
            char c=sc.next().charAt(0);
            if(c=='y')
            {
                score=(coinleft+5);
            }
            else
            {
                score=coinleft;
            }
            System.out.printf("Points won : %d",score);
        }
    }
}
