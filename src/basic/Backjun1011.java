package basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Backjun1011 {
	static StringTokenizer st;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	
		
		int num = Integer.parseInt(br.readLine().trim());
		for(int i=0;i<num;i++) {
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int dist = y1-x1;
			int n= (int) Math.ceil(Math.sqrt(dist));
			int MaxDist = (int)Math.pow(Math.ceil(Math.sqrt(dist)), 2);
			int maxNum = n*2-1;
			int numberTime = maxNum;
			
			if(dist<=MaxDist-n) {
				numberTime = maxNum-1;
			}
			bw.write(numberTime+"\n");
		}
		bw.close();

	}
}
