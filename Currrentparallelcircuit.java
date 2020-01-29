import java.util.Scanner;
import java.text.*;
import java.lang.*;
class Main
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       int i;
       System.out.println("Enter voltage supply");
       double vol=sc.nextDouble();
       System.out.println("Enter the number of resistors in parallel");
       int n=sc.nextInt();
       
       System.out.println("Enter the values of resistors in ohms");
       float a[]=new float[n];
       for(i=0;i<n;i++)
       {
           a[i]=sc.nextFloat();
       }
       Double r=0.0;
       for( i=0;i<n;i++)
       {
           r=(double)r+(1.0/a[i]);
           String numberD=String.valueOf(r);
           numberD=numberD.substring(numberD.indexOf("."));
           char x=numberD.charAt(numberD.length()-1);
           if(x=='5')
           {
               r=(double)Math.round(r*1000)/1000;
           }
           else
           {
               r=(double)Math.round(r*100)/100;
           }
       }       
           r=(double)1.0/r;
           r=(double)Math.round(r*100)/100;
           System.out.printf("Value of Req %.2f ohm\n",r);
           double cur=vol/r;
           System.out.printf("Total current flowing through circuit %.2f A",cur);
       
    }
}
