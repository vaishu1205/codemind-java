import java.util.Scanner;
public class Height
{
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        int x = read.nextInt();
        int y = read.nextInt();
        if(x>y)
        {
            System.out.println(x);
        }
        else
        {
            System.out.println(y);
        }
    }
}