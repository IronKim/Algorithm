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
		
		
		try
		{
			int cnt = Integer.parseInt(br.readLine());
			
			for (int i = 0; i < cnt; i++)
			{
				for (int j = 0; j < cnt; j++)
				{
					if(j + i < cnt - 1) {
						bw.write(" ");						
					}else {
						bw.write("*");
					}
				}
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
