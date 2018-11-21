package eightlevel;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 백준2292벌집 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long num = Integer.parseInt(br.readLine().trim());
		int cnt=1;
		long range = 1;
		long tmp =1;
		//범위대로 설정한다.
		while(true){
			if(range>=num){
				break;
			}
			tmp=6*(cnt++);
			range+=tmp;
		}
		System.out.print(cnt);
	}

}
