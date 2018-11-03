package sevenlevel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 백준10809알파벳찾기 {

	public static void main(String[] args) throws IOException {
		// TODO 자동 생성된 메소드 스텁
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String st = br.readLine();
	//a 97 z 122
		int[] alpha = new int[26];
		Arrays.fill(alpha,-1);
		for(int i=0;i<st.length();i++) {
			char tmp=st.charAt(i);
			int index=st.indexOf(tmp);
			
			alpha[tmp-97] =index;
		}
		
		for(int j=0;j<alpha.length;j++) {
			System.out.print((j!=alpha.length-1)?alpha[j]+" ":alpha[j]);
		}
	}	

}
