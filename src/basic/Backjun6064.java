package basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Backjun6064 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int count = Integer.parseInt(br.readLine());
		for(int i=0;i<count;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int M = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			int xe = Integer.parseInt(st.nextToken());
			int ye = Integer.parseInt(st.nextToken());
			int x= 1, y=1;
			int cnt = 1; 
			int d =1;
			//10 12 3 9      33
			// 3.  3   3
			// 15. 3    
			while(true) {
				if(x==xe) { //x좌표가 목표좌표 (xe)라면 x고정
					d=M;
				}
				else if(y==ye) { //y좌표가 목표좌표 (ye)라면 y고정
					d=N;
				}
				
				//M or N 만큼 건너 뛰기
				x = ((x+d)%M ==0) ? M : (x+d)%M;
				y = ((y+d)%N ==0) ? N : (y+d)%N;
				cnt+= d;
				if(x==xe&&y==ye) break;
				if(cnt > M*N) {
					cnt = -1;
					break;
				}
			}
			bw.write(cnt+"\n");
		}
		bw.close();
	}

}
