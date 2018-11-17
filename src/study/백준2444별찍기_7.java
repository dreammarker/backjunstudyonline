package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 백준2444별찍기_7 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=1;i<count;i++) {
			
			//공백
			for(int j=0;j<count-i;j++) {
				sb.append(" ");
			}
			
			//별찍기
			for(int z=0;z<i*2-1;z++) {
				sb.append("*");
			}
			
			sb.append("\n");
		}
		
		for(int j=count;j>0;j--) {
			
			for(int i=0;i<count-j;i++) {
				sb.append(" ");
			}
			
			for(int z=0;z<2*j-1;z++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}

}
