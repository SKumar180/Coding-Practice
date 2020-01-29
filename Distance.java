import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.*;
import java.text.DecimalFormat;
class Main
{
    public static void main(String args[])
    {
        try{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Coordinates :");
        System.out.println("Enter X1 :");
        int x1=Integer.parseInt(br.readLine());
        System.out.println("Enter X2 :");
        int x2=Integer.parseInt(br.readLine());
        System.out.println("Enter Y1 :");
        int y1=Integer.parseInt(br.readLine());
        System.out.println("Enter Y2 :");
        int y2=Integer.parseInt(br.readLine());
        double d=(double)((x2-x1)*(x2-x1)-(y2-y1)*(y2-y1));
        d=Math.sqrt(d);
        DecimalFormat decimalFormat=new DecimalFormat("#0.##");
        System.out.println("Distance between two points : "+decimalFormat.format(d));
           }
           catch(IOException e)
           {
               e.printStackTrace();
           }
    }       
}
