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
		StringTokenizer st = null;
		
		try {
			ArrayList<Integer> al = new ArrayList<>();
			int n = Integer.parseInt(br.readLine());
			int max = 0;
			int temp = 0;
			double avg = 0;
			
			st = new StringTokenizer(br.readLine());
			
			while (st.hasMoreTokens())
			{
				temp = Integer.parseInt(st.nextToken());
				al.add(temp);
				if(temp > max) {
					max = temp;
				}
			}
			
			for (Integer i : al)
			{
				avg += (double)i/max * 100;
			}
			bw.write(String.valueOf(avg / n));
			
			bw.flush();
			bw.close();
			
		} catch (IOException e){
			e.printStackTrace();
		} 
	}
}
