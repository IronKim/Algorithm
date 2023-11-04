import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class Main
{
	public static void main(String[] args)
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		HashMap<Character, Integer> hm = new HashMap<>();
		
		try {
			String s = br.readLine();
			int sum = 0;
			int max = 0;
			char c = 0;
			char dap = 0;
			s = s.toUpperCase();
			
			for (int i = 0; i < s.length(); i++){
				c = s.charAt(i);
				sum = hm.getOrDefault(c, 0);
				sum++;
				
				hm.put(c, sum);
				
				if(sum > max) {
					max = sum;
					dap = c;
				}else if (sum == max) {
					dap = '?';
				}	
			}
			bw.write(dap);
			bw.flush();
			bw.close();
			
		} catch (IOException e){
			e.printStackTrace();
		} 
	}
}
