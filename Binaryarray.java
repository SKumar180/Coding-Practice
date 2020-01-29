import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,count=0,cnt=0,r;
        int a[]=new int[20];
        System.out.println("Enter total number of states :");
        int n=sc.nextInt();
        System.out.println("Enter states :");
        for( i=0;i<n;i++)
        {
            r=sc.nextInt();
            if(r==0||r==1){
                a[i]=r;
                if(r==1)
                {
                    count++;
                }
                else
                cnt++;
            }
            else
            {
                System.out.println("Invalid Input");
                System.exit(0);
            }
        }
        System.out.println("ON : "+count);
        System.out.println("OFF : "+cnt);
        System.out.println("After State Change :");
        for(i=0;i<n;i++)
        {
            if(a[i]==1)
            {
                System.out.println("0");
            }
            else
            System.out.println("1");
        }
        System.out.println("ON : "+cnt);
        System.out.println("OFF : "+count);
    }
}
