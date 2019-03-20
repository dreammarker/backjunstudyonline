package basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class CopyOfBaekjoon10451 {
	static boolean [] address; //정점위치
	static int[] n; //정점 내용물
	static int answer = 0; //정답 카운트
	
	static void dfs(int index){
		if(address[index]){
			answer++;
			return;
		}
		int next;
		address[index] = true;
		next = n[index]; //방문할 위치저장
		dfs(next);
	}
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		for(int i=0;i<T;i++){
			int size = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			address = new boolean [size+1]; //정점 (순열) 위치 ex) 1,2,3,4
			n	    = new int [size+1]; //순열(정점 내용물)
			answer = 0;
			for(int j=1;j<=size;j++){
				n[j] = Integer.parseInt(st.nextToken());
			}
			
			for(int j=1;j<=size;j++){
				if(!address[j]){ //j가 정점에 방문하지 않았다면
					dfs(j);
				}
			}
			bw.write(answer+"\n");
		}
		bw.close();
	
	}

}
