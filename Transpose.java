import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int i,j;
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[20][20];
        int b[][]=new int[20][20];
        System.out.println("Enter size :");
        int n=sc.nextInt();
        System.out.println("Enter Matrix elements");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Before Transpose :");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.print("\n");
        }
        System.out.println("After Transpose :");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(a[j][i]+" ");
            }
            System.out.print("\n");
        }
        System.out.println("Resultant Matrix :");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
             b[i][j]=a[i][j]+a[j][i];
             System.out.print(b[i][j]+" ");
             
            }
            System.out.print("\n");
        }
    }
}
