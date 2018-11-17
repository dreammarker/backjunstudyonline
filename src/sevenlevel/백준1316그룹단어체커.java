package sevenlevel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 백준1316그룹단어체커 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		String a1[]=new String [count];
		int numcount=0;
		int nexcount=0;
		//count 반복 횟수 입력 a1 단어 영어가 생각안나변수
		for(int i=0;i<count;i++) {
			a1[i]=br.readLine();
			//String 안에 있는 단어하나의 아파뱃 하나씩 ...
			int b[] = new int [30];
			//아닌거..
			int not=0;
			for(int j=0;j<a1[i].length();j++) {
				int asc=(int)(a1[i].trim().charAt(j));

				if(j!=a1[i].length()-1&&a1[i].charAt(j)==a1[i].charAt(j+1)) {
					nexcount=1;
				}else {
					if(j==0) {
						nexcount=0;
					}
					else if(a1[i].charAt(j-1)==a1[i].charAt(j)) {
						nexcount=1;
					}
				}
				
				if(nexcount==0&&b[asc-97]==1) {
					not=1;
				}
				else {
					b[asc-97]=1;
				
				//지금알파벳이 다음알파벳하고 같으면 
				if(j==a1[i].length()-1) {
					if(not==1) {
						break;
					}else {
						numcount+=1;
						break;
					}
						
				}}
			}
			
		}
		System.out.println(numcount);*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		int answer=count;
		for(int i=0;i<count;i++) {
			String word = br.readLine().trim();
			boolean[] checker = new boolean[26];
			for(int j=1;j<word.length();j++) {
				if(word.charAt(j-1)!=word.charAt(j)) {
					if(checker[word.charAt(j)-97]==true) {
						answer--;
						break;
					}else {
						checker[word.charAt(j-1)-97]=true;
					}
				}
			}
		}
		System.out.println(answer);
		
	}

}
