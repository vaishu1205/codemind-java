import java.util.Scanner;
public class Averagetwo
{
    public static void main(String[] args)
    {
        Scanner read=new Scanner(System.in);
        int a=read.nextInt();
        int b=read.nextInt();
        double c;
        c=(a+b)/2.0;
        System.out.printf("%.4f",c);
    }
}