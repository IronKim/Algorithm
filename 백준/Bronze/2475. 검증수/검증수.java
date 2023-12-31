import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main
{
	public static void main(String[] args)
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try
		{
			StringTokenizer st = new StringTokenizer(br.readLine());
			ArrayList<Integer> list = new ArrayList<>();
			while (st.hasMoreTokens())
			{
				list.add(Integer.parseInt(st.nextToken()));
			}
			int sum = 0;
			for (Integer i : list)
			{
				sum += Math.pow(i, 2);
			}
			bw.write(String.valueOf(sum % 10));
			bw.flush();
			bw.close();
			
		} catch (IOException e)
		{
			
			e.printStackTrace();
		}
	}
}