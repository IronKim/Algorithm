import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		long N = scan.nextLong();
		long M = scan.nextLong();
		
		System.out.println(Math.abs(N - M));
		
	}
}
