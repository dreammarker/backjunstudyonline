package basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Bk9466 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int tc = new Integer(br.readLine());
		while(tc-->0){
			int n = new Integer(br.readLine());
			int mates[] =new int [n+1];
			StringTokenizer st =new StringTokenizer(br.readLine());
			for(int i=1;i<=n;i++){
				mates[i] = new Integer(st.nextToken());
			}
			bw.write(find(n,mates)+"\n");
		}
		bw.close();
		
	}
	static int find(int n,int[] mates){
		int links[] = new int [n+1];
		int ans = n;
		for(int i=1;i<=n;i++){
			int current = i;
			while(links[current] ==0){
				links[current] = i;
				current = mates[current];
			}
			//자기자신
			if(links[current] == i){
				int start = current;
				ans--;
				while((current = mates[current])!=start)
					ans--;
			}
		}
		return ans;
	}
	
}
