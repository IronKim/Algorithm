import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main
{
	public static void main(String[] args)
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int A = 0;
		int B = 0;
		int C = 0;
		int temp = 0;
		String dap = "";
		char[] c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		try
		{
			A = Integer.parseInt(br.readLine());
			B = Integer.parseInt(br.readLine());
			C = Integer.parseInt(br.readLine());
			dap = String.valueOf(A * B * C);
			
			
			for (int i = 0; i < c.length; i++)
			{
				temp = 0;
				for (int j = 0; j < dap.length(); j++)
				{
					if(c[i] == dap.charAt(j)) {
						temp++;
					}
				}
				bw.write(String.valueOf(temp));
				bw.newLine();
			}
			bw.flush();
			bw.close();
			
		} catch (IOException e)
		{
			
			e.printStackTrace();
		} 
	}
}
