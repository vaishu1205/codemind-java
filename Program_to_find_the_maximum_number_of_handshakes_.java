import java.util.Scanner;
public class Maxumunhandshakes
{
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        int a = read.nextInt();
        int s = ((a-1)*a)/2;
        System.out.println(s);
    }
}