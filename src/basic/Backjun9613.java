package basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Backjun9613 {
	public static void main(String[] args) throws Exception{
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	 int n = Integer.parseInt(br.readLine());
	 
	 for(int i=0;i<n;i++) {
		 String num[] = br.readLine().split(" ");
		 long ans=0;
		 for(int j=1;j<num.length-1;j++) {
			 for(int b=j+1;b<num.length;b++) {
				ans+=gcd(Integer.parseInt(num[j]),Integer.parseInt(num[b])); 
			 }
		 }
		 bw.write(""+ans+"\n");
	 }
	 bw.close();
	}
	static int gcd(int a,int b) {
		if(b==0) {
			return a;
		}
		else {
			return gcd(b,a%b);
		}
	}
}
