package basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


//
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//
//public class Solution {
//
//	public static void main(String[] args) throws Exception{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int num[][] = new int [100][100];
//		for(int i=0;i<10;i++){
//			String n = br.readLine();
//			for(int a=0;a<100;a++){
//				StringTokenizer st = new StringTokenizer(br.readLine());
//				for(int b=0;b<100;b++){
//					num[a][b]=Integer.parseInt(st.nextToken());
//				}
//			}
//			int a=99;
//			int b;
//			int c=0;
//				for(b=0;b<100;b++){
//					if(num[a][b]==2){
//						c=b;
//						while(a!=0){
//							//좌회전
//							if((c-1)>0&&num[a-1][c]==0&&num[a][c-1]==1){
//								c--;
//							}
//							//우회전
//							else if((c+1)<100&&num[a-1][c]==0&&num[a][c+1]==1){
//								c++;
//							}
//							//직진
//							else if((a-1)>=0&&num[a-1][c]==1){
//								a--;
//							}
//							
//						}
//						break;
//					}
//				}
//				System.out.println(c);
//			
//		}
//	}
//
//}
class Solution6{
	static int [][] ladder = new int[100][100];
	static int enp[] = new int [100];
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int i=0;i<10;i++){
			int n = Integer.parseInt(br.readLine());
			for(int a=0;a<100;a++){
				StringTokenizer st =new StringTokenizer(br.readLine());
				for(int b=0;b<100;b++){
					int tmp=Integer.parseInt(st.nextToken());
					if(a==99&&tmp==1) Solution6.enp[b] = 1;
					Solution6.ladder[a][b]=tmp;
				}
			}
			int min=9999;
			for(int c=0;c<100;c++){
				if(Solution6.enp[c]==1)
				min=Math.min(min,new Solution6().solve(c));
			}
			bw.write("#"+n+" "+min+"\n");
			
		}
		bw.close();
		
	}
	public int solve(int q){
		int x =q, y=99;
		int cnt=1;
		while(y>0){
			ladder[y][x] = 3; //방문 표시?
			cnt++;
			if((x-1)>=0&&ladder[y][x-1]==1){
				x--;
			}else if((x+1)<100&&ladder[y][x+1]==1){
				x++;
			}else if((y-1)>=0&&ladder[y-1][x]==1){
				y--;
			}else{
				break;
			}
			
		}
		return cnt;
	}
}






















