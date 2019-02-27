package basic;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Backjun4948_ {
	public static int MAX = 246912; // 입력되는 수의 최대값이 12345 이니깐 2N 까지는 구해야 한다.
	
	public static boolean[] isNot_pNum;
	public static int[] pNumCntArr;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		isNot_pNum = new boolean[MAX+1];
		pNumCntArr = new int[MAX+1];
		
		getPrimeNum();
		
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			int num = Integer.parseInt(br.readLine());
			if(num == 0) break;
			
			sb.append((pNumCntArr[num*2] - pNumCntArr[num]) + "\n");
		}
		
		System.out.println(sb.toString());
		
		br.close();
	}

	public static void getPrimeNum() {
		// 소수 구하기
		isNot_pNum[1] = true;
		
		for(int i=2; i <= MAX; i++) {
			for(int j=2; i*j <= MAX; j++) {
				isNot_pNum[i*j] = true;
			}
		}
		// 0 ~ i 까지(최대:MAX) 까지의 수까지 존재하는 실수의 수를 구한다. 
		for(int i=2; i <= MAX; i++) {
			pNumCntArr[i] = pNumCntArr[i-1];
			if(!isNot_pNum[i]) pNumCntArr[i]++;
		}
	}
}

