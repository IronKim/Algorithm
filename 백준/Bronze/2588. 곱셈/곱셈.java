import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int S = scan.nextInt();
		
		String sL = String.valueOf(S);
		
		int cnt = sL.length() - 1;
		
		
		for (int i = cnt; i > -1; i--)
		{
			System.out.println(N * Integer.valueOf(Character.toString(sL.charAt(i))));
			
		}
		System.out.println(N * S);
	}
}