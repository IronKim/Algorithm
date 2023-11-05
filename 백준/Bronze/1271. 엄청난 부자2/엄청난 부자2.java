import java.math.BigInteger;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		
		BigInteger n = scan.nextBigInteger();
		BigInteger m = scan.nextBigInteger();
		System.out.println(n.divide(m));
		System.out.println(n.mod(m));
		
	}
}
