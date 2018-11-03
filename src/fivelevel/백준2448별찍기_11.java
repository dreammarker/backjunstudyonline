package fivelevel;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 백준2448별찍기_11 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO 자동 생성된 메소드 스텁
		//재귀 함수를 이용해야한다고 한다. 재귀 공백문자 배열
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	  
		int a= Integer.parseInt(br.readLine());
		System.out.println(a);
		for(int i=0;i<a;i++) {
			for(int j=0;j<a;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	

}
