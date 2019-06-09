package basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
class Pai{
	int x;
	int y;
	Pai(int x,int y){
		this.x =x;
		this.y =y;
	}
}
public class Baekjoon7576 {
	public static final int[]dx = {0,0,1,-1};
	public static final int[]dy = {1,-1,0,0};
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		int nu [][] = new int [n][m];
		int [][] dist = new int [n][m];
		Queue<Pai> q =new LinkedList<Pai>();
		
		for(int i=0;i<n;i++){
			String num[] = br.readLine().split(" ");
			for(int j=0;j<m;j++){
				nu[i][j] = new Integer(num[j]); //값을 넣는다
				dist[i][j] = -1; //-1값으로 채워넣는다
				if(nu[i][j]==1){ //값이 1인것이 있으면 Que에다가 저장한다.
					q.add(new Pai(i,j));
					dist[i][j] = 0;
				}
			}
		}
		while(!q.isEmpty()){
			Pai p = q.remove();//맨앞에있는 요소제거
			int x = p.x; //맨앞요소 x값
			int y = p.y;// 맨앞요소 y값
			for(int k=0;k<4;k++){
				int nx =x+dx[k];
				int ny =y+dy[k];
				if(0<=nx&&nx<n&&ny>=0&&ny<m){
					//익지않은 토마토이거나 .. 방문하지않은곳
					if(nu[nx][ny]==0&&dist[nx][ny]==-1){
						q.add(new Pai(nx,ny));
						dist[nx][ny] = dist[x][y] +1;
					}
				}
			}
		}
		int ans =0;
		//최고 값
		for(int i=0;i<n;i++){
			for(int j=0; j<m;j++){
				if(ans<dist[i][j]){
					ans = dist[i][j];
				}
			}
		}
		for(int i=0;i<n;i++){
			for(int j=0; j<m;j++){
				//방문하지않거나 익지않은 토마토가 있을떄
				if(nu[i][j]==0&&dist[i][j]==-1){
					ans = -1;
				}
			}
		}
		
		System.out.println(ans);
		
	}

}
