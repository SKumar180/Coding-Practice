import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        float a,b,res;
        int choice;
        Scanner sc=new Scanner(System.in);
            System.out.println("Enter the numbers");
            a=sc.nextFloat();
            b=sc.nextFloat();
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1 :res=a+b;
                        System.out.println("Addition of two numbers "+res);
                        break;
                case 2 :res=a-b;
                        System.out.println("Subtraction of two numbers "+res);
                        break;
                case 3 :res=a*b;
                        System.out.println("Multiplication of two numbers "+res);
                        break;
                case 4 :res=a/b;
                        System.out.println("Division of two numbers "+res);
                        break;
                default :System.out.println("Invalid Input");        
            }
    }
}
