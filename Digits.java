package homework;
import java.util.Scanner;
public class Digits {
	public static void main(String[] args) {

        int count = 0, num;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter any positive integer:");
        num=scan.nextInt();
        scan.close();
        while(num != 0)
        {
            num /= 10;
            ++count;
        }

        System.out.println("Number of digits: " + count);
    }
}
