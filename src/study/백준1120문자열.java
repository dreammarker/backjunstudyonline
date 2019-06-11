package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 백준1120문자열 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String A = st.nextToken();
		String B = st.nextToken();
		
		int lengthA=A.length();
		int lengthB=B.length();
		int co = lengthB-lengthA;
		int min = Integer.MAX_VALUE;
		int cnt =0;
		for(int i=0;i<=co;i++) {
			cnt =0;
			for(int j=0;j<lengthA;j++) {
				if(A.charAt(j)!=B.charAt(j+i)) {
					cnt++;
				}
			}
				min=Math.min(min, cnt);
		}
		System.out.println(min);
	}

}
