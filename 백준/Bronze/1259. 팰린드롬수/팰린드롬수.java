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
		StringTokenizer st = null;
		
		try {
			String s = "";
			String dap = "";
			boolean chk = true;
			
			while (true)
			{
				s = br.readLine();
				if(s.equals("0")) {
					break;
				}
				chk = true;
				for (int i = 0; i < s.length() / 2; i++)
				{
					if(s.charAt(i) == s.charAt( s.length() - i - 1) ) {
						chk = true;
					}else {
						chk =false;
						break;
					}
				}
				if(chk == true) {
					dap += "yes ";
				}else {
					dap += "no ";
				}
			}
			
			st = new StringTokenizer(dap);
			
			while (st.hasMoreTokens())
			{
				bw.write(st.nextToken());
				bw.newLine();
			}
			
			
			
			bw.flush();
			bw.close();
			
		} catch (IOException e){
			e.printStackTrace();
		} 
	}
}
