import java.util.Scanner;
public class Cancross
{
    public static void main(String[] args)
    {
        Scanner read=new Scanner(System.in);
        int x = read.nextInt();
        int y = read.nextInt();
        int z = read.nextInt();
        System.out.println((z-y)/x);
    }
}