package basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baekjoon1260 {
	static ArrayList<Integer>[] a;
	static boolean[] c;
	//dfs 깊이우선 탐색 재귀로 구현.
	public static void dfs(int x){
		//c[x]가 true?
		if(c[x]){
			return;
		}
		c[x] = true;
		System.out.print(x+" ");
		for(int y : a[x]){
			//다탐색했는데 탐색하지않을것이 있을댸 돌아가기
			if(c[y]==false){
				dfs(y);
			}
		}
	}
	
	// bfs 너비우선 탐색
	public static void bfs(int start){
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(start);
		c[start] = true;
		while(!q.isEmpty()){
			int x = q.remove();
			System.out.print(x+" ");
			for(int y : a[x]){
				if(c[y]==false){
					c[y] = true;
					q.add(y);
				}
			}
		}
	}
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int start = Integer.parseInt(st.nextToken());
		
		a = (ArrayList<Integer>[])new ArrayList[n+1];
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
		for(int i=1;i<=n;i++){
			Collections.sort(a[i]);
		}
		for(int i=1;i<=n;i++){
			System.out.println(a[i]);
		}
		c = new boolean[n+1];
		dfs(start);
		System.out.println();
		c = new boolean[n+1];
		bfs(start);
		System.out.println();
	}

}
