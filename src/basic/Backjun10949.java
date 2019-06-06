package basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Backjun10949 {

	public static void main(String[] args) throws Exception{
		Random random = new Random();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int b[][] = new int [n][2];
		int bFound;
		//a값 0 은 1번쨰턴의 숫자값 1는 2번쨰턴으 숫자값
		for(int a=0;a<2;a++) {
			for(int i=0;i<4;i++) {
				while(true) {
					b[i][a] = random.nextInt(10);
					bFound = 0;
					for(int j=0;j<i;j++) {
						if(b[j][a]==b[i][a]) {
							bFound =1;
							break;
						}
					}
					if(bFound!=1)
						break;
				}
			}
		}
		System.out.println("몇세트 하시겠습니까");
		int set =Integer.parseInt(br.readLine());
		for(int i=0;i<set;i++) {
			//첫번쨰자리 체크
			String check[] = br.readLine().split("");
		}
		
		
	}

}
