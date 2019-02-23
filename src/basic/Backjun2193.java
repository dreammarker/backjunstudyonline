package basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Backjun2193 {
	static long d[];
	static int count;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		count = Integer.parseInt(br.readLine());
		d = new long[count+1];
		d[1] = 1;
		for(int i=2;i<=count;i++) {
			d[i] = d[i-2]+d[i-1];
		}
		System.out.println(d[count]);
	}
}
