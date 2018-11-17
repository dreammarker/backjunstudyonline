package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 백준10991별찍기_16 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<count;i++) {
			//공백
			for(int j=0;j<count-1-i;j++) {
				sb.append(" ");
			}
			
			//별찍기
			for(int z=0;z<2*(i+1)-1;z++) {
				if(z%2==0)
				sb.append("*");
				else
				sb.append(" ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}

}
