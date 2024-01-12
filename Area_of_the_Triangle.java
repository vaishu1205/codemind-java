import java.util.Scanner;
public class Trianglarea
{
    public static void main(String[] args)
    {
        Scanner read=new Scanner(System.in);
        double a=read.nextDouble();
        double b=read.nextDouble();
        double c=read.nextDouble();
        double s=(a+b+c)/2;
        double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.printf("%.2f",area);
    }
}