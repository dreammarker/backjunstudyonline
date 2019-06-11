package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 백준11047동전0 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = new Integer(st.nextToken());
		int k = new Integer(st.nextToken());
		int num[]= new int [n];
		for(int i=0;i<n;i++) {
			num[i] = new Integer(br.readLine());
		}
		//반복기준
		int cnt = n-1;
		int count = 0;
		while(cnt!=-1) {
			count+=k/num[cnt];
			k%=num[cnt];
			cnt--;
		}
		//나누기를 해서 횟수를 구한다음 %연산자값을 통해 값을 갱신해준다.
		System.out.println(count);
		
	}

}
