package basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Backjun9465 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		//테스트 수..
		for(int i=0;i<n;i++) {
			//행
			int col = Integer.parseInt(br.readLine());
			long a[][] = new long [col+1][2];
			
			String num[]= br.readLine().split(" ");
			String num2[] = br.readLine().split(" ");
			//1열
			for(int j=1;j<=col;j++) {
				a[j][0] =Long.parseLong(num[j-1]); 
			}
			//2열
			for(int j=1;j<=col;j++) {
				a[j][1] =Long.parseLong(num2[j-1]); 
			}
			// 
			long d[][] = new long [col+1][3];
			for(int j=1;j<=col;j++) {
				d[j][0] = Math.max(d[j-1][0], Math.max(d[j-1][1],d[j-1][2]));
				d[j][1] = Math.max(d[j-1][0], d[j-1][2])+a[j][0];
				d[j][2] = Math.max(d[j-1][0], d[j-1][1])+a[j][1];
			}
			long ans = 0;
			
			ans = Math.max(d[col][0], Math.max(d[col][1], d[col][2]));
			bw.write(ans+"\n");
		}
		bw.close();
			
	}

}
