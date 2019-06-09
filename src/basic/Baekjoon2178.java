package basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Pairs{
	int x;
	int y;
	Pairs(int x, int y){
		this.x =x;
		this.y =y;
	}
}
public class Baekjoon2178 {
	
	public static final int[] dx = {0,0,1,-1};
	public static final int[] dy = {1,-1,0,0};
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = new Integer(st.nextToken());
		int m = new Integer(st.nextToken());
		int num[][] = new int [n][m];
		for(int i=0;i<n;i++){
			String nu = br.readLine();
			for(int j=0;j<m;j++){
				num[i][j]=nu.charAt(j)-'0';
			}
		}
		
		int [][] dist = new int[n][m];
		boolean [][] check = new boolean[n][m];
		Queue<Pairs> q = new LinkedList<Pairs>();
		q.add(new Pairs(0,0));
		check[0][0] = true;
		dist[0][0] = 1;
		while(!q.isEmpty()){
			Pairs p = q.remove();
			int x = p.x;
			int y = p.y;
			for(int k=0;k<4;k++){
				int nx = x+dx[k];
				int ny = y+dy[k];
				if(0<=nx&&nx<n&&0<=ny&&ny<m){
					//방문안하고 1인곳 
					if(check[nx][ny]==false&&num[nx][ny]==1){
						q.add(new Pairs(nx,ny));
						dist[nx][ny] = dist[x][y]+1;
						check[nx][ny] = true;
					}
				}
			}
		}
		System.out.println(dist[n-1][m-1]);
	}

}
