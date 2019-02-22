package basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Backjun1475 {

	public static void main(String[] args) throws Exception{	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String number= br.readLine();
		//봉지
		int ad[] =new int [10];
		for(int i=0;i<number.length();i++) {
			ad[number.charAt(i)-'0'] ++;
		}
//		ad[6]=ad[6]/2+ad[6]%2;
		ad[6] = (int)Math.ceil((ad[6]+ad[9])/2.0);
		ad[9] = 0;
		int i,temp=0;
		for(i=0;i<10;i++) {
			if(ad[i] > temp ) temp = ad[i];
		}
		System.out.println(temp);

	}

}
