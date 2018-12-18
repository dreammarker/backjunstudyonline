package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 백준117262xn타일링 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		int []d= new int[1001];
		d[0] = 1; //2x0
		d[1] = 1; //2x1
		for(int i=2;i<=num;i++) {
			d[i]=d[i-1]+d[i-2];
			d[i]%=10007;
		}
		System.out.println(d[num]);
		}

}
