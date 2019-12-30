import java.util.Scanner;
public class Divisibilityprint
{
    public static int divisible(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%3==0)
            System.out.println("3");
            else if(arr[i]%5==0)
            System.out.println("5");
            else if(arr[i]%3==0&&arr[i]%5==0)
            System.out.println("35");
            else
            System.out.println(arr[i]);
            return arr;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        Divisibilityprint d=new Divisibilityprint();
        d.divisible(a);
    }
}
