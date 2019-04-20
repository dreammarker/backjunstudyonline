package algospot;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Jumpgame2 {
	static int cache[][];
	static int num[][];
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
		int n = new Integer(br.readLine());
		
		//몇번?
		while(n-->0){
			//몇 n^2 의 행렬
			int m = new Integer(br.readLine());
			num = new int [m+1][m+1];
			cache =new int [m+1][m+1];
			for(int i=1;i<=m;i++){
				StringTokenizer st = new StringTokenizer(br.readLine());
				for(int j=0;j<=m;j++){
					num[i][j] = new Integer(st.nextToken());
				}
			}
			//
			bw.write(jump(0,0,m)?"YES\n":"NO\n");
		}
		bw.close();
	}
	public static boolean jump(int y,int x,int n){
		//기저사례 처리
		if(y>n||x>n) return false;
		
		if(y==n||x==n) return true;
		if(cache[y][x]==1) {
			return false;
		}
		else {
			cache[y][x]=1;
		}
		return jump(y,x+num[y][x],n)||jump(y+num[y][x],x,n);
 	}

}
