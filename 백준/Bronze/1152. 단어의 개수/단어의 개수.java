import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String string = scan.nextLine();
		if(string.equals(" ")) {
			System.out.println(0);
		}else {
		System.out.println(string.trim().split(" ").length);
		}
	}
}

