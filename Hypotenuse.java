import java.util.Scanner;
public class Trianglarea
{
    public static void main(String[] args)
    {
        Scanner read=new Scanner(System.in);
        int a=read.nextInt();
        int b=read.nextInt();
        double area=Math.sqrt((a*a)+(b*b));
        System.out.printf("%.2f",area);
    }
}