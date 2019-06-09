package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Pair{
	int x;
	int y;
	Pair(int x,int y){
		this.x =x;
		this.y =y;
	}
}
public class Baekjoon2667 {
	public static final int[] dx ={0,0,1,-1};
	public static final int[] dy = {1,-1,0,0};
	public static void dfs(int[][] a, int[][] group,int x, int y, int cnt, int n){
		group[x][y] =cnt;
		for(int k=0;k<4;k++){
			int nx = x+dx[k];
			int ny = y+dy[k];
			if(1<=nx&&nx<=n&&1<=ny&&ny<=n){
				if(a[nx][ny]==1 &&group[nx][ny]==0){
					dfs(a,group,nx,ny,cnt,n);
				}
			}
		}
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = new Integer(br.readLine());
		int num[][] = new int [n+1][n+1];
		for(int i=1;i<=n;i++){
			String nu= br.readLine();
			for(int j=1;j<=n;j++){
				num[i][j] =nu.charAt(j-1)-'0'; //
			}
		}
			int cnt = 0;
			
			int group[][] = new int[n+1][n+1];
			for(int a=1;a<=n;a++){
				for(int b=1;b<=n;b++){
					if(num[a][b]==1&&group[a][b]==0){
						dfs(num,group,a,b,++cnt,n);
					}
				}
			}
			for(int i=1;i<=n;i++){
				for(int j=1;j<=n;j++){
					System.out.print(group[i][j]);
				}
				System.out.println();
			}
			int [] ans = new int[cnt+1];
			for(int i=1;i<=n;i++){
				for(int j=1;j<=n;j++){
					if(group[i][j]!=0){
						ans[group[i][j]]+=1; //카운팅 +1
					}
				}
			}
			Arrays.sort(ans);
			System.out.println(cnt);
			for(int i=1;i<=cnt;i++){
				System.out.println(ans[i]);
			}
			
		
		
	}

}
