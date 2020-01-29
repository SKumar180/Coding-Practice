import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,count=0,cnt=0,r;
        int a[]=new int[20];
        System.out.println("Select parity generator\n1.Odd parity\n2.Even parity\n");
        int val=sc.nextInt();
        switch(val)
        {
            case 1:System.out.println("Enter the bits");
            for(i=0;i<8;i++)
            {
                r=sc.nextInt();
                if(r==0||r==1){
                    a[i]=r;
                }
                else{
                    System.out.println("Please enter either 1 or 0");
                    i--;
                }
            }
            for(i=0;i<8;i++)
            {
                if(a[i]==1)
                {
                    count++;
                }
                if(a[i]==0){
                    cnt++; 
                }
            }
            if(count%2==0 && cnt%2==1)
            {
                System.out.println("Generated parity bit 0");
            }
            else
            {
                System.out.println("Generated parity bit 1");
            }
            break;
        case 2:System.out.println("Enter the bits");
        for(i=0;i<8;i++)
        {
           r=sc.nextInt();
           if(r==0||r==1)
           {
               a[i]=r;
           }
           else
           {
               System.out.println("Please enter either 1 or 0");
               i--;
           }
        }
        for(i=0;i<8;i++)
        {
            if(a[i]==1)
            {
                count++;
            }
            if(a[i]==0)
            {
                cnt++;
            }
        }
        if(count%2==1 && cnt%2==0)
        {
            System.out.println("Generated parity bit 1");
        }
        else
            System.out.println("Generated parity bit 0");
        break;
        default :System.out.println("Invalid option");
        break;
        }
        
    }
}
