package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 백준2442별찍기_5 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int count = Integer.parseInt(br.readLine());
		
		br.close();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=1;i<=count;i++) {
			
			for(int j=0;j<count-i;j++) {
				sb.append(" ");
			}
			
			for(int z=0;z<i*2-1;z++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
		
	}

}
