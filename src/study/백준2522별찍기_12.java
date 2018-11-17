package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 백준2522별찍기_12 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<count;i++) {
			//공백
			for(int j=0;j<count-i-1;j++) {
				sb.append(" ");
			}
			
			//별찍기
			for(int z=0;z<count-(count-i-1);z++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		for(int j=count-1;j>0;j--) {
			//공백
			for(int z=0;z<count-j;z++) {
				sb.append(" ");
			}
			//별찍기
			for(int w=0;w<j;w++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		System.out.println(sb);
		
	}

}
