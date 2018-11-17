package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 백준2445별찍기_8 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		StringBuilder sb= new StringBuilder();
		for(int i=1;i<=count;i++) {
			
				//별찍기
				for(int q=0;q<i;q++) {
					sb.append("*");
				}
				//공백
				for(int w=0;w<2*(count-i);w++) {
					sb.append(" ");
				}
				//별찍기
				for(int q=0;q<i;q++) {
					sb.append("*");
				}
				sb.append("\n");
		}
		for(int i=count-1;i>0;i--) {
				//별찍기
				for(int q=0;q<i;q++) {
					sb.append("*");
				}
				//공백
				for(int b=0;b<2*(count-i);b++) {
					sb.append(" ");
				}
				//별찍기
				for(int q1=0;q1<i;q1++) {
					sb.append("*");
				}
				sb.append("\n");
		}
		System.out.println(sb);
	}

}
