package basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Backjun1912 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String num[] = br.readLine().split(" ");
		int a[] = new int [n+1];
		int d[] = new int [n+1];
		for(int i=1;i<=n;i++) {
			a[i]=Integer.parseInt(num[i-1]);
		}
		d[1]=a[1];
		int ans=d[1];
		if(n!=1) {
			for(int i=2;i<=n;i++) {
				if(a[i]>d[i-1]+a[i])
					d[i]=a[i];
				else {
					d[i]=d[i-1]+a[i];
				}
			}
			for(int i=1;i<=n;i++) {
				if(ans<d[i])
					ans=d[i];
			}
			
			}
		System.out.println(ans);
		}

}
