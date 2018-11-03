package fivelevel;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 백준1065한수 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO 자동 생성된 메소드 스텁
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	  
		int n= Integer.parseInt(br.readLine());
		int rsltCnt = 0;
		for(int j=1;j<=n;j++) {
			String stringj=Integer.toString(j); //j를 스트링타입으로 저장
			int length = stringj.length(); //길이 저장
			int num1= Integer.parseInt(stringj.substring(0,1)); //첫쨰자리수 저장
			int dff=10;  //10
			
			boolean isOk = true;
			for(int i=1;i<length;i++) {
				int num2 =Integer.parseInt(stringj.substring(i,i+1)); 
				
				if(dff==10) {
					dff=num2-num1;
				}
				else {
					if(dff!=(num2-num1)) {
						isOk = false;
						break;
					}
				}
				num1 = num2;
			}
			if(isOk) {
				rsltCnt++;
			}
		}
		System.out.println(rsltCnt);
	}

}
