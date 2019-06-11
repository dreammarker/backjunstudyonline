package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 백준5585거스름돈 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = 1000-new Integer(br.readLine());
		int price[] = new int [6];
		price[0] = 500;
		price[1] = 100;
		price[2] = 50;
		price[3] = 10;
		price[4] = 5;
		price[5] = 1;
		int m =0;
		int cnt = 0;
		while(cnt!=6) {
			m+=num/price[cnt];
			num%=price[cnt];
			cnt++;
		}
		System.out.println(m);
	}

}
