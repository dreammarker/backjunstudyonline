package basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Backjun2745 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String num[]=br.readLine().split(" ");
		int ans =0;
		int b =Integer.parseInt(num[1]);
		for(int i=0;i<num[0].length();i++){
			if('0'<=num[0].charAt(i)&&num[0].charAt(i)<='9')
			   ans = ans * b + (num[0].charAt(i)-'0');
			else{
				ans =ans*b + (num[0].charAt(i)-'A'+10);
			}
		}
		System.out.println(ans);
		
	}

}
