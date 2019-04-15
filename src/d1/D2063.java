package d1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class D2063 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = new Integer(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int num[] = new int [n];
		for(int i=0;i<n;i++){
			num[i] = new Integer(st.nextToken());
		}
		Arrays.sort(num);
		System.out.println(num[((n+1)/2)+1]);

	}

}
