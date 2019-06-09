package basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Backjun2156 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		//포도주 시식
		int d[] = new int [n+1]; 
		int a[] = new int [n+1];
		for(int i=1;i<=n;i++) {
			a[i]= Integer.parseInt(br.readLine());
		}
		if(n==1) {
			d[1] = a[1];
		}
		else if(n==2) {
			d[2] = a[1]+a[2];
		}
		else {
			d[1] = a[1];
			//잔이 두개
			d[2] = a[1]+a[2];
			//잔이 3개있을떄
			for(int i=3;i<=n;i++) {
				d[i] = d[i-1];
				if(d[i]<d[i-2]+a[i])
					d[i]=d[i-2]+a[i];
				if(d[i]<d[i-3]+a[i]+a[i-1])
					d[i]=d[i-3]+a[i]+a[i-1];
			}
		}
		System.out.println(d[n]);
	}
}
