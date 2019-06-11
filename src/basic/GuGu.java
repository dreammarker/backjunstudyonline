package basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GuGu {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		
		String nn[][] = new String [count][count];
		for(int i=0;i<count;i++) {
			for(int j=0;j<count;j++) {
				nn[i][j] = (i+1)+"번쟤행 "+(j+1)+"번열에 있습니다";
			}
		}
		int num = Integer.parseInt(br.readLine());
		System.out.println(nn[(num-1)/count][(num-1)%count]);
		
	}

}
