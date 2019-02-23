package basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Backjun1149 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		int d[][] = new int[count+1][3];
		int a[][] = new int[count+1][3]; //셋팅할값
		d[0][0] = d[0][1] = d[0][2] = a[0][0] = a[0][1] = a[0][2] = 0;
		for(int i=1;i<=count;i++) {
			String[] rocation = br.readLine().split(" ");
			d[i][0] = Math.min(d[i-1][1], d[i-1][2])+Integer.parseInt(rocation[0]);
			d[i][1] = Math.min(d[i-1][0], d[i-1][2])+Integer.parseInt(rocation[1]);
			d[i][2] = Math.min(d[i-1][0], d[i-1][1])+Integer.parseInt(rocation[2]);
			
		}
		System.out.println(Math.min(Math.min(d[count][0], d[count][1]),d[count][2] ));
	}

}
