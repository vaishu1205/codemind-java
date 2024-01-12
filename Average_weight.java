import java.util.Scanner;
public class Averweight
{
    public static void main(String[] args)
    {
        Scanner read=new Scanner(System.in);
        int t=read.nextInt();
        int b1=read.nextInt();
        int b2=read.nextInt();
        System.out.println((3*t)-b1-b2);
    }
}