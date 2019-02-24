package basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Backjun9465 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++) {
            long[][] a = new long[n+1][2];
            {
                String[] line = br.readLine().split(" ");
                for (int e=1; e<=n; e++) {
                    a[e][0] = Long.valueOf(line[e-1]);
                }
            }
            {
                String[] line = br.readLine().split(" ");
                for (int e=1; e<=n; e++) {
                    a[e][1] = Long.valueOf(line[e-1]);
                }
            }
            
			long d[][] = new long [n+1][3];
			
			for(int q=1;q<=n;q++) {
				d[q][0] = Math.max(d[q-1][0], Math.max(d[q-1][1],d[q-1][2]));
				d[q][1] = Math.max(d[q-1][0], d[q-1][2])+a[q][0];
				d[q][2] = Math.max(d[q-1][0], d[q-1][1])+a[q][1];
			}
			long ans =0;
            ans = Math.max(d[n][0], Math.max(d[n][1], d[n][2]));
            System.out.println(ans);
		}
	}

}
