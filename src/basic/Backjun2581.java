package basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Backjun2581 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n1 = Integer.parseInt(br.readLine());
		int n2 = Integer.parseInt(br.readLine());
		//소수 구하기 작은수 큰수 입력
		int i,j;
		int sum= 0;
		int minimum =0;
		//n2부터 n1까지 내려가면서 소수를 찾는다.
		for(i = n2; i>=n1; i--){
			for(j=2;j<i;j++) if(i%j==0) break;
			if(j==i){
				sum+=i;
				minimum = j;
			}
		}
		System.out.println(sum == 0 ? -1 : sum+"\n"+minimum);
		
	}

}
