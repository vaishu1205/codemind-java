import java.util.Scanner;
public class Lastdigits
{
	public static void main(String[] args)
	{
		Scanner read = new Scanner(System.in);
		int year=read.nextInt();
		int yr = year %100;
     	System.out.printf("%02d",yr);
	}
}