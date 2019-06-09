package basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Baekjoon10451 {
	static boolean [] address; //정점위치
	static int[] n; //정점 내용물
	static int answer = 0; //정답 카운트
	
	static void dfs(int index){
		if(address[index]){//이미 방문했던 곳이라면 순열이므로 count++;
			answer++; return;
		}
		
		int nextAdd;
		address[index] = true; // j위치 방문표시;
		nextAdd = n[index] - 1; //그다음으로 방문할 위치 저장 //배열이라 index 값 이 0부터시작하므로 
		dfs(nextAdd);
	}
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		for(int i=0;i<T;i++){
			int size = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			address = new boolean [size]; //정점 (순열) 위치 ex) 1,2,3,4
			n	    = new int [size]; //순열(정점 내용물)
			answer = 0;
			for(int j=0;j<size;j++){
				n[j] = Integer.parseInt(st.nextToken());
			}
			
			for(int j=0;j<size;j++){
				if(!address[j]){ //j가 정점에 방문하지 않았다면
					dfs(j);
				}
			}
			bw.write(answer+"\n");
		}
		bw.close();
	
	}

}
