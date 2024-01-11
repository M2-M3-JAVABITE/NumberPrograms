import java.util.*;
class Armstrong_No
{
    public static void main(String args[])
    { 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n1=sc.nextInt();
        int copy=n1,s=0;
        while(n1!=0)
        {
            int d=n1%10;
            s=s+(d*d*d);
            n1=n1/10;
        }
        if(copy==s)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not an Armstrong Number");
    }
}
