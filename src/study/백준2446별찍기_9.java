package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 백준2446별찍기_9 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		StringBuilder sb= new StringBuilder();
		for(int i=0;i<count;i++) {
			//공백
			for(int z=0;z<i;z++) {
				sb.append(" ");
			}
			
			//별찍기
			for(int j=0;j<2*(count-i)-1;j++) {
				sb.append("*");
			}
			sb.append("\n");
			
		}
		
		for(int j=1;j<count;j++) {
			//공백
			for(int z=0;z<count-j-1;z++) {
				sb.append(" ");
			}
			
			for(int w=0;w<2*(j+1)-1;w++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		System.out.println(sb);
			
	}

}
