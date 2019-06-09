package basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Three {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = new Integer(br.readLine());
		for(int i=1;i<=n;i++) {
			String num = String.valueOf(i);
			int cnt = 0;
			for(int j=0;j<num.length();j++) {
				if((num.charAt(j)-'0')%3==0&&(num.charAt(j)-'0')!=0) {
					cnt++;
				}
			}
			if(cnt!=0) {
				while(cnt-->0) {
					bw.write("-");
				}
			}
			else {
				bw.write(num);
			}
			bw.write(" ");
		}
		bw.close();
	}

}
