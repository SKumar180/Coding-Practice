import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int img,i,j,k;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter image size :");
        img=sc.nextInt();
        int a[]=new int[20];
        int b[][]=new int[20][20];
        for(k=1;k<=3;k++)
        {
          System.out.println("Enter threshold "+k+" :");
          a[k]=sc.nextInt();
        }
        System.out.println("Enter values :");
        for(i=0;i<img;i++)
        for(j=0;j<img;j++)
        {
            b[i][j]=sc.nextInt();
        }
        System.out.println("Before Conversion :");
        for(i=0;i<img;i++){
            for(j=0;j<img;j++)
            {
              System.out.print(b[i][j]+" ");
            }
            System.out.print("\n");
        }
        for(i=0;i<img;i++)
        {
            for(j=0;j<img;j++)
            {
                if(b[i][j]<=a[1])
                {
                    b[i][j]=a[1];
                }
                else if(b[i][j]>a[1]&&b[i][j]<=a[2])
                {
                b[i][j]=a[2];
                }
                else if(b[i][j]>a[2])
                {
                b[i][j]=a[3];
                }
            }
        }
        System.out.println("After Conversion :");
        for(i=0;i<img;i++)
        {
            for(j=0;j<img;j++)
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}
