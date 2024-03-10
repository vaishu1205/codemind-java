import java.util.Scanner;
public class Interiordesign
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int a = x1+y1;
        int b =x2+y2;
        if(a>b)
        {
            System.out.println(b);
        }
        else
        {
            System.out.println(a);
        }
    }
}