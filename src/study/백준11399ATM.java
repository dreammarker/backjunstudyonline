package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 백준11399ATM {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = new Integer(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int num[] = new int [n];
		for(int i=1;i<=n;i++) {
			num[i-1]=new Integer(st.nextToken());
		}
		Arrays.sort(num);
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum+=num[i-1]*(n-i+1);
		}
		System.out.println(sum);
	}

}
