import java.util.Scanner;
public class Romeohukiet
{
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        int x = read.nextInt();
        int y = read.nextInt();
        int z = read.nextInt();
        System.out.println(((x*5)+(y*10))/z);
    }
}