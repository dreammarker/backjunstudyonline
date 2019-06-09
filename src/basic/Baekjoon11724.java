package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Baekjoon11724 {
	public static void dfs(ArrayList<Integer>[] a,boolean[] c,int x){
		if(c[x]){
			return;
		}
		c[x] = true;
		for(int y : a[x]){
			if(c[y]==false){
				dfs(a,c,y);
			}
		}
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int u = Integer.parseInt(st.nextToken());
		ArrayList<Integer>[]  a=  new ArrayList[n+1];
		//List안에 List
		for(int i=1;i<=n;i++){
			a[i] = new ArrayList<Integer>();
		}
		
		for(int i=0;i<u;i++){
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			a[N].add(M);
			a[M].add(N);
		}
		boolean[] check = new boolean[n+1];
		int ans = 0;
		for(int i=1;i<=n;i++){
			if(check[i]== false){
				dfs(a,check,i);
				ans+=1;
			}
		}
		System.out.println(ans);
	}

}
