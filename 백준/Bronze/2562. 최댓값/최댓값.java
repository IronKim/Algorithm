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
		int max = 0;
		int index = 0;
		int temp = 0;
		try
		{
			for (int i = 0; i < 9; i++)
			{
				temp = (Integer.parseInt(br.readLine()));
				if(max < temp) {
					max = temp;
					index = i + 1;
				}
			}
			
			bw.write(String.valueOf(max));
			bw.newLine();
			bw.write(String.valueOf(index));
			bw.flush();
			bw.close();
			
		} catch (IOException e)
		{
			
			e.printStackTrace();
		}
	}
}
