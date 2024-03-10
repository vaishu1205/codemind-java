import java.util.Scanner;
public class Studentregistration
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            int m=sc.nextInt();
            int y=sc.nextInt();
            int n=sc.nextInt();
            if((m+n)<=y)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}