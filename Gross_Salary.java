import java.util.Scanner;
public class Grosssalary
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int bs= sc.nextInt();
        double da,hra,gs;
        if(bs<=10000)
        {
            da = 0.8*bs;
            hra=0.2*bs;
            gs = bs+da+hra;
            System.out.printf("%.2f",gs);
        }
        else if(bs<=20000)
        {
            da= 0.9*bs;
            hra=0.25*bs;
            gs=da+hra+bs;
            System.out.printf("%.2f",gs);
        }
        else
        {
            da=0.95*bs;
            hra=0.3*bs;
            gs=da+hra+bs;
            System.out.printf("%.2f",gs);
        }
    }
}