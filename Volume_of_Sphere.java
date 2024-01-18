import java.util.Scanner;
public class Volumesp
{
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        int r=read.nextInt();
        double volume;
        volume= (4*3.14*r*r*r)/3;
        System.out.printf("%.2f",volume);
    }
}