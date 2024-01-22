import java.util.Scanner;
public class Capacity
{
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        int s = read.nextInt();
        int b = read.nextInt();
        int t = read.nextInt();
        int cap = s*b*t;
        System.out.printf("%d KB", cap);
        
    }
}