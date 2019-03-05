package basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Backjun1934 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++) {
			String num[] = br.readLine().split(" ");
			int n1 = Integer.parseInt(num[0]);
			int n2 = Integer.parseInt(num[1]);
			bw.write(""+n1*n2/grc(n1,n2)+"\n");
		}
		bw.close();
	}
	static int grc(int a,int b) {
		if(b==0) {
			return a;
		}
		else {
			return grc(b,a%b);
		}
	}
}
