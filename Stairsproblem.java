public class Stairs
{
    public static int func(int n)
    {
        if(n<=0)
            return 0;
        if(n==1)
        return 1;
        else if(n==2)
        return 2;
        else if (n==3)
        return 4;
        else
        return func(n-1)+func(n-2)+func(n-3);
    }
    public static void main(String[] args)
    {
        int n=5;
        int f=func(n);
        System.out.println("NO of ways a person can crosss 5 stairs is "+f);
    }
}
//if the crossing of stairs is only two step 1 step and 2 step then base case and general case changes little bit.
