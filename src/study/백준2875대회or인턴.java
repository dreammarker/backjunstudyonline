package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 백준2875대회or인턴 {

	public static void main(String[] args) throws Exception{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st =new StringTokenizer(br.readLine());
		int n = new Integer(st.nextToken());
		int m = new Integer(st.nextToken());
		int k = new Integer(st.nextToken());
		for(int i=0;i<k;i++) {
			if(n>=2*m) {
				n-=1;
			}else if(n<2*m){
				m-=1;
			}
		}
		if((n/2)<m) {
			m=n/2;
		}
		System.out.println(m);
		
		
	}

}
