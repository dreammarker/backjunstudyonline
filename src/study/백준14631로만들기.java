package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 백준14631로만들기 {

	public static void main(String[] args) throws Exception {
		//Bottom 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
        int[] d = new int[n+1];
        d[1] = 0;
        //작은 문제를 푼다 
        for (int i=2; i<=n; i++) {
            d[i] = d[i-1] + 1;
            if (i%2 == 0 && d[i] > d[i/2] + 1) {
                d[i] = d[i/2] + 1;
            }
            if (i%3 == 0 && d[i] > d[i/3] + 1) {
                d[i] = d[i/3] + 1;
            }
        }
        System.out.println(d[n]);
	}
}
