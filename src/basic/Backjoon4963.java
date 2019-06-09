package basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;



public class Backjoon4963 {
	public static final int dx[] ={-1,1,0,0,-1,-1,1,1};
	public static final int dy[] ={0,0,1,-1,1,-1,1,-1};
	
	public static void dfs(int a[][],int group[][],int x, int y,int cnt,int h,int w){
		group[x][y] =cnt; //방문표시
		for(int k=0;k<8;k++){
			int nx = x+dx[k];
			int ny = y+dy[k];
			if(nx>=0&&nx<h&&ny>=0&&ny<w){
				if(a[nx][ny]==1&&group[nx][ny]==0){ //정점이거나 방문하지않았을때
					dfs(a,group,nx,ny,cnt,h,w);
				}
			}
		}
	}
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		while(true){
			StringTokenizer st = new StringTokenizer(br.readLine());
			int w = Integer.parseInt(st.nextToken());
			int h = Integer.parseInt(st.nextToken());
			if( w==0||h==0)
				break;
			else{
				int num[][] = new int[h][w];
				
				for(int i=0;i<h;i++){
					String nu[] = br.readLine().split(" ");
					for(int j=0;j<w;j++){
						num[i][j]=new Integer(nu[j]);
					}
				}
				int cnt = 0;
				
				int group[][] = new int [h][w];
				for(int i=0;i<h;i++){
					for(int j=0;j<w;j++){
						if(num[i][j]==1&&group[i][j]==0){
							dfs(num,group,i,j,++cnt,h,w);
						}
					}
				}
				bw.write(cnt+"\n");
			}
			
		}
		bw.close();
	}

}
