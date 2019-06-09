package basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Baekjoon1707 {
	public static void dfs(ArrayList<Integer>[] a,int[] color,int x, int c){
		color[x] = c;
		for(int y : a[x]){
			if(color[y]==0){
				dfs(a,color,y,3-c);
			}
		}
	}
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0){
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			ArrayList<Integer>[] a = (ArrayList<Integer>[]) new ArrayList[n+1];
			for(int i=1;i<=n;i++){
				a[i] = new ArrayList<Integer>();
			}
			for(int i=0;i<m;i++){
				st = new StringTokenizer(br.readLine());
				int u = Integer.parseInt(st.nextToken());
				int v = Integer.parseInt(st.nextToken());
				a[u].add(v);
				a[v].add(u);
			}
			int [] color = new int[n+1];
			boolean ok = true;
			for(int i=1;i<=n;i++){
				if(color[i]==0){
					dfs(a,color,i,1);
				}
			}
			for(int i=1;i<=n;i++){
				for(int j : a[i]){
					if(color[i] == color[j]){
						ok = false;
					}
				}
			}
			if(ok){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
		}
	}
}
