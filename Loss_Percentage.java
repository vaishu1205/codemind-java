import java.util.Scanner;
public class Losspercen
{
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        double cp=read.nextDouble();
        double sp=read.nextDouble();
        double loss;
        loss=cp-sp;
        double lp;
       lp=(loss/cp) * 100;
       System.out.printf("%.2f",lp);
    }
}