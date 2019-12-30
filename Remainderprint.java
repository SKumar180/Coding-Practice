import java.util.Scanner;
public class Divisibilityprint
{
    public static int[] divisible(int arr[])
    {
          for(int i=0;i<arr.length;i++)
        {
            //a[i]=sc.nextInt();
            arr[i]=i+1;
        }
        for(int i=0;i<arr.length;i++)
        {
          //  if(arr[i]%3==0&&arr[i]%5!=0){
           // System.out.println("3");
           // arr[i]=arr[i]%6;
           // }
           // else if(arr[i]%5==0&&arr[i]%3!=0){
            //System.out.println("5");
          //  arr[i]=arr[i]%6;
           // }
           // else if(arr[i]%3==0&&arr[i]%5==0)
           // {
           // System.out.println("35");
            arr[i]=arr[i]%6;
           // }
        }
        return arr;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
      
        Divisibilityprint d=new Divisibilityprint();
        int[] f=d.divisible(a);
        for(int i=0;i<n;i++)
        System.out.print(f[i]+" ");
        
    }
}
