package basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CountSort {

	public static void main(String[] args) throws Exception{
		// TODO 자동 생성된 메소드 스텁
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine().trim());
		if(num>=1&&num<=10000000) {
			int number[] = new int [10001];
			for(int i=0; i<num;i++) {
				number[Integer.parseInt(br.readLine().trim())]++;
			}
			for(int a=0;a<number.length;a++) {
				if(number[a]!=0) {
					for(int b=0;b<number[a];b++) {
						bw.write(a+"\n");
					}
				}
			}
			bw.close();
		}
	}

}
