import java.util.Scanner;
public class SigmaN
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        double sum=0,i=1,n;
        System.out.println("Enter any integer value");
        n=sc.nextDouble();
        while(i<=n)
        {
            sum=sum+i;
            i++;
        }
        System.out.println("Sum of the series="+sum);
    }
}