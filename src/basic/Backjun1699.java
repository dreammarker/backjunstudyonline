package basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Backjun1699 {

	public static void main(String[] args) throws Exception{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int []d= new int [n+1];
		for(int i=1;i<=n;i++) {
			d[i]=i;
			for(int j=1;j*j<=i;j++) {
				if(d[i]>d[i-j*j]+1)
				d[i]=d[i-j*j]+1;
			}
		}
		System.out.println(d[n]);
		//어떤수를 만드는데 n 마지막에 올수 있는수를 i
		
	}

}
