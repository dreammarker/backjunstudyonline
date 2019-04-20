package basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Backjun2004 {

	public static void main(String[] args) throws Exception{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());
		long m = Long.parseLong(br.readLine());
		long two = 0, five =0;
		for(long i=2;i<=n;i*=2) {
			two +=n/i;
		}
		for(long i=2;i<=n-m;i*=2) {
			two -=(n-m)/i;	
		}
		for(long i=2;i<=m;i*=2) {
			two -=m/i;
		}
		for(long i=5;i<=n;i*=5) {
			five +=n/i;
		}
		for(long i=5;i<=n-m;i*=5) {
			five -=(n-m)/i;
		}
		for(long i=5;i<=m;i*=5) {
			five -=m/i;
		}
		System.out.println(Math.min(two, five));
	}

}
