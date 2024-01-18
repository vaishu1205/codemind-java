import java.util.Scanner;
public class Frames
{
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        int l=read.nextInt();
        int w=read.nextInt();
        int x=read.nextInt();
        int len;
        len = (x*l)/1;
        int wid;
        wid=(x*w)/1;
        System.out.println((2*len)+(2*wid));
    }
}