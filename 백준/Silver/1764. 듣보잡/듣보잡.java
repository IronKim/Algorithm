import java.util.*;
import java.util.Map.Entry;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Map<String, Integer> map = new HashMap<String, Integer>();
		List<String> list = new ArrayList<String>();
        
        int a = Integer.valueOf(st.nextToken());
		int b = Integer.valueOf(st.nextToken());
        
        for(int i = 0; i < a + b; i++) {
			String name = br.readLine();
			map.put(name, map.getOrDefault(name, 0) + 1);
		}
		
		for (Entry<String, Integer> m : map.entrySet()) {
			if(m.getValue() == 2) {
				list.add(m.getKey());
			}
		}
		
		Collections.sort(list);
		
		bw.write(list.size() + "\n");
		
		for (String string : list) {
			bw.write(string + "\n");
		}
        
        bw.flush();
    }
}