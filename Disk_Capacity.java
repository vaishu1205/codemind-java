import java.util.Scanner;
public class Disk
{
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        int s = read.nextInt();
        int b = read.nextInt();
        System.out.println(t*512*s*b*2);
    }
}