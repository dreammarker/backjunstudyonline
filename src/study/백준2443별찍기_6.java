package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 백준2443별찍기_6 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		br.close();
		
		StringBuilder st= new StringBuilder();
		
		for(int i=count;i>0;i--) {
			
				//공백
			for(int j=0;j<count-i;j++) {
				st.append(" ");
			}
			
				//별찍기
			for(int z=0;z<2*i-1;z++) {
				st.append("*");
			}
			st.append("\n");
		}
		System.out.println(st);
	}

}
