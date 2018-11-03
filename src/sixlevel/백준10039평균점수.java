package sixlevel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 백준10039평균점수 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO 자동 생성된 메소드 스텁
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum=0;
		for(int i=0;i<5;i++) {
		int n1=Integer.parseInt(br.readLine());
		if(n1%5==0) {
			if(n1<40) {
				n1=40;
			}
			sum+=n1;
		}
		}
		System.out.println(sum/5);
	}

}
