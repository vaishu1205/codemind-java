import java.util.Scanner;
public class Rainfall
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x<3)
        {
            System.out.println("LIGHT");
        }
        else if(x>=3 && x<7)
        {
            System.out.println("MODERATE");
        }
        else
        {
            System.out.println("HEAVY");
        }
    }
}