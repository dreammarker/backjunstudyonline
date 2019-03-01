package basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Backjun11722 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n= Integer.parseInt(br.readLine());
		String num[] = br.readLine().split(" "); 
		int a[] = new int [n+1];
		int d[] = new int [n+1];
		for(int i=1;i<=n;i++) {
			a[i] = Integer.parseInt(num[i-1]);
			d[i]=1;
		}
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				if(a[i]<a[j]&&d[i]<d[j]+1) {
					d[i] = d[j]+1;
				}
			}
		}
		int ans=d[1];
		for(int i=1;i<=n;i++) {
			if(ans<d[i]) {
				ans=d[i];
			}
		}
		System.out.println(ans);
		
	}
}
