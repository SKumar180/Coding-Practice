import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Main
{
    public static void main(String args[])throws IOException
    {
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter number of rows");
    int row=Integer.parseInt(br.readLine());
    for(int i=1;i<=row;i++)
    {
        for(int j=1;j<=i;j++)
        {
            System.out.print("*");
        }
        System.out.println("");
    }
        if(row<1)
        {
            System.out.println("Invalid Input");
            System.exit(0);
        }
    }
}
