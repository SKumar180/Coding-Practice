
import java.util.Scanner;
public class Floyds {
	 public static void main(String[] args) {
	        Scanner scan= new Scanner(System.in);
	        System.out.print("Enter n: ");
	        int n = scan.nextInt();
	        scan.close();
	        for (int i = 1; i <= n; i++) {
	            for (int j = 1; j <= i; j++) {
	                if ((i + j) % 2 == 0) {
	                    System.out.print("1 ");
	                } else {
	                    System.out.print("0 ");
	                }
	            }
	            System.out.println();
	        }
}
}
ex:-
output:-
Enter n: 5
1 
0 1 
1 0 1 
0 1 0 1 
1 0 1 0 1 
