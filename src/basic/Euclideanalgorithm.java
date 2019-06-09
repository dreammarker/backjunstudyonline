package basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Euclideanalgorithm {
	static long sum = 1;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = new Integer(br.readLine());
		while(n-->0){
			StringTokenizer st =new StringTokenizer(br.readLine());
			long n1 = new Long(st.nextToken());
			long n2 = new Long(st.nextToken());
			bw.write(gcd(factorial(n1),n2)+"\n");
		}
		bw.close();

	}
	static long factorial(long n){
		
		if(n==1){
			return sum;
		}
		else{
			return sum=factorial(n-1)*n;
		}
		
	}
	static long gcd(long m,long n){
		
		if(n==0){
			return m;
		}else{
			return gcd(n,m%n);
		}
	}
}
