import java.util.Scanner;
public class Swaptwo
{
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        int a = read.nextInt();
        int b = read.nextInt();
        int temp = a;
        a = b;
        b=temp;
        System.out.println(a);
        System.out.println(b);
        
    }
}
