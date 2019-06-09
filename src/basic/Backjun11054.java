package basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Backjun11054 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String num[] =br.readLine().split(" ");
		int a[] = new int [n+1];
		int p[] = new int [n+1];
		int d[] = new int [n+1];
		for(int i=1;i<=n;i++) {
			a[i]= Integer.parseInt(num[i-1]);
			p[i]=1;
			d[i]=1;
		}
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				if(a[i]>a[j]&&p[i]<p[j]+1) {
					p[i]=p[j]+1;
				}
			}
		}
		    int[] d2 = new int[n+1];
	        for (int i=n; i>0; i--) {
	            d2[i] = 1;
	            for (int j=i; j<=n; j++) {
	                if (a[i] > a[j] && d2[j]+1 > d2[i]) {
	                    d2[i] = d2[j]+1;
	                }
	            }
	        }
		int ans=p[1]+d2[1]-1;
		for(int i=1;i<=n;i++) {
			if(ans<p[i]+d2[i]-1) {
				ans=p[i]+d2[i]-1;
			}
		}
		System.out.println(ans);
	}
	

}
