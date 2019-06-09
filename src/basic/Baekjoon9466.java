package basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Baekjoon9466 {
	static int a[] = new int [100001];
	static int d[] = new int [100001];
	static int s[] = new int [100001];
	static int n;
	static int dfs(int x,int cnt,int step){
		if(d[x]!=0){
			if(step!=s[x]){
				return 0;
			}
			return cnt-d[x];
		}
		d[x] = cnt;
		s[x] = step;
		return dfs(a[x],cnt+1,step);
	}
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		while(n --> 0){
			int num = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=1;j<=num;j++)
				a[j]=Integer.parseInt(st.nextToken());
			int ans = 0;
			for( int b=1;b<=num;b++){
				if(d[b]==0){
					ans+= dfs(b,1,b);
				}
			}
			bw.write(num-ans+"\n");
		}
		bw.close();
	}

}
