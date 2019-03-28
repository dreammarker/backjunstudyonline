package algospot;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Coins {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = new Integer(br.readLine());
		while(n-->0){
			StringTokenizer st = new StringTokenizer(br.readLine());
			//환전할 금액
			int price = new Integer(st.nextToken());
			//동전 종류 개수
			int coinC= new Integer(st.nextToken());
			//종전 종류
			int coin[] = new int [coinC];
			st = new StringTokenizer(br.readLine());
			for(int i=0;i<coinC;i++){
				coin[i] = new Integer(st.nextToken());
			}
			//환전할 금액에 따른 경우의 수.
		}
	}
}
