import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main
{
	public static void main(String[] args)
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		try
		{
			int num = (Integer.parseInt(br.readLine()));
			for (int i = 0; i < num; i++)
			{
				StringTokenizer st = new StringTokenizer(br.readLine()); 
				int repeat = (Integer.parseInt(st.nextToken()));
				String temp = st.nextToken();
				for (int j = 0; j < temp.length(); j++)
				{
					for (int j2 = 0; j2 < repeat; j2++)
					{
						bw.write(temp.charAt(j));
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
