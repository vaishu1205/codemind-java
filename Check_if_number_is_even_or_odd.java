import java.util.Scanner;
public class Even
{
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        if(n%2==0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }
    }
}