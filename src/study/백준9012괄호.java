package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 백준9012괄호 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		for(int i=0;i<count;i++) {
			String str[]= br.readLine().trim().split("");
			int cnt=0;
			for(int j=0;j<str.length;j++) {
				if("(".equals(str[j])) {
					cnt+=1;
				}else if(")".equals(str[j])){
					cnt-=1;
				}
				if(cnt<0) {
					System.out.println("NO");
					break;
				}
			}
			if(cnt<0) {
				
			}
			else if(cnt!=0) {
				System.out.println("NO");
			}else if(cnt==0) {
				System.out.println("YES");
			}
		}
	}

}
