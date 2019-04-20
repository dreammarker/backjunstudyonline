package basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Backjun1676 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int cnt=0;
		int temp=0;
		for(int i=1;i<=n;i++) {
			if(i%5==0) {
				temp=i;
				while(true) {
					if(temp%5==0) {
						temp=temp/5;
						cnt++;	
					}
					else {
						break;
					}
				}
			}
		}
		System.out.println(cnt);
	}

}
