package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 백준10992별찍기_17 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<count;i++) {
			for(int w=0;w<count-(i+1);w++) {
				sb.append(" ");
			}
			for(int j=0;j<2*(i+1)-1;j++) {
				if(i==0||i==count-1)
				sb.append("*");
				else if(j==0)
				sb.append("*");
				else if(j==2*(i+1)-2)
				sb.append("*");
				else
				sb.append(" ");
			}
			sb.append("\n");
		}
		System.out.print(sb);
		
		
	}
}
