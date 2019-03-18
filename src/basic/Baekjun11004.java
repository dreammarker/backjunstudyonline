package basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjun11004 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String num[] = br.readLine().split(" ");
		StringTokenizer st = new StringTokenizer(br.readLine());
		int nu[] = new int [Integer.parseInt(num[0])];
		for(int i=0;i<Integer.parseInt(num[0]);i++){
			nu[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(nu);
		System.out.println(nu[Integer.parseInt(num[1])-1]);
	}

}
