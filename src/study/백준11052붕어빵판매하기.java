package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 백준11052붕어빵판매하기 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//붕어빵 몇개 판매할지
		int num = Integer.parseInt(br.readLine());
		
		//판매하는 갯수에 따른 가격측정
		String [] a = br.readLine().replaceAll(" ","").split("");
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		
		//d[n] 판매하는 갯수에 따른 가격
		int [] d = new int[num+1];
		//1+2+3 더하기와과 비슷 비교바람
		for(int i=0;i<num;i++) {
			for(int j=0;j<i;j++) {
				if(d[i]<d[i-j]+Integer.parseInt(a[j]))
				d[i]= d[i-j]+Integer.parseInt(a[j]);
			}
		}
		System.out.println(d[num]);
	}

}
