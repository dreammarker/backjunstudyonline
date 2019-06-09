package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 백준2271로프 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = new Integer(br.readLine());
		int num [] = new int [n];
		for(int i=0;i<n;i++) {
			num[i] = new Integer(br.readLine());
		}
		Arrays.sort(num);
		int k =0;
		for(int i=n-1;i>-1;i--) {
			if(k<num[i]*(n-i)) {
				k = num[i]*(n-i); //비교 
			}
		}
		System.out.println(k);
	}

}
