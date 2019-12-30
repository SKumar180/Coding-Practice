
import java.util.Scanner;
public class Sumavg {
	public static void main(String[] args) 
    {
        int sum = 0;
        float average;
        Scanner scan = new Scanner(System.in);
        int a[] = new int[5];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < 5 ; i++)
        {
            a[i] = scan.nextInt();
            sum = sum + a[i];
        }
    	scan.close();
        System.out.println("Sum:"+sum);
        average = (float)sum / 5;
        System.out.println("Average:"+average);
    }
}
//
//Output:-

Enter all the elements:
7
7
3
8
9
Sum:34
Average:6.8
