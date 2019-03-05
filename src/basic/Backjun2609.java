package basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Backjun2609 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n[] =br.readLine().split(" ");
		int n1 = Integer.parseInt(n[0]);
		int n2 = Integer.parseInt(n[1]);
		int al=grc(n1,n2);
		System.out.println(al);
		System.out.println(n1*n2/al);
	}
	static int grc(int a,int b) {
		if(b==0) {
			return a;
		}else {
			return grc(b,a%b);
		}
	}
}
