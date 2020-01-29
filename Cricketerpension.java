import java.io.*;
class Main
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        double amount;
        System.out.println("Has the player represented for India[y or n]?");
        String indi=br.readLine();
        char ind=indi.charAt(0);
        if(ind=='y')
        {
            System.out.println("Enter the number of Test matches he has played");
            int test=Integer.parseInt(br.readLine());
            System.out.println("Enter the number of ODI matches he has played");
            int odi=Integer.parseInt(br.readLine());
            System.out.println("Number of man of the matches he has won");
            int man=Integer.parseInt(br.readLine());
            if(test>10&&odi>100)
            amount=50000.00;
            else if(test>10)
            amount=25000.00;
            else if(odi>100)
            amount=15000.00;
            else
            amount=10000.00;
            amount+=(0.25*man*amount);
        }
        else
        {
           System.out.println("Has he played IPL[y or n]?");
           String ipls=br.readLine();
           char ipl=ipls.charAt(0);
           if(ipl=='y')
           amount=8000.00;
           else
           amount=7000.00;
        }
        System.out.print("Amount received as pension: ");
        System.out.println("Rs."+amount);
        
    }
}
