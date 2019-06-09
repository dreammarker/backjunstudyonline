package basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Backjun11652 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		long a[] = new long [n];
		for(int i=0;i<n;i++){
			long num = Long.parseLong(br.readLine());
			a[i]= num;
		}
		Arrays.sort(a);
		long ans = a[0];
		int ans_cnt = 1;
		int cnt = 1;
		for(int i=1;i<n;i++){
			if(a[i]==a[i-1]){
				cnt+=1;
			}
			else{
				cnt = 1;
			}
			if(ans_cnt < cnt){
				ans_cnt = cnt;
				ans = a[i];
			}
		}
		System.out.println(ans);
	}

}
