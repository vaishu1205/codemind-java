import java.util.Scanner;
public class Profitpercen
{
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        double cp=read.nextDouble();
        double sp=read.nextDouble();
        double profit;
        profit=sp-cp;
        double pp;
       pp=(profit/cp) * 100;
       System.out.printf("%.2f",pp);
    }
}