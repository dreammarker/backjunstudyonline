package sevenlevel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 백준1157단어공부 {

	public static void main(String[] args) throws IOException {
		//예제입력 Mississipi -> 출력 ?
		//첫쨰줄에서 가장 많이 사용된 알파벳을 대문자로 출력한다. a=97 A=65 z=122  Z=90
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine();
		//trim 공백제거 a~z=97~122 
		//알파뱃순서 뒤바뀌는거 생각 못함ㅠㅠ
		String a_asc[]=a.trim().split("");
		int [] b=new int [30];
		for(int i=0;i<a_asc.length;i++) {
			
			int asc=(int)(a_asc[i].charAt(0));
			if(asc>96) {
				asc=asc-32;
			}
			b[asc-65]+=1;
		}
		int max=0;
		int cnt=0;
		for(int j=0;j<b.length;j++) {
			//j+1 에러 부분 조심 length-1
			if(j==b.length-1)
				break;
			//여기실수햇음...
			max=Math.max(max,b[j]);
		}
		//여기까진 맞음..
		int index=0;
		//요부분이 잘못됨
		for(int z=0;z<b.length;z++) {
			if(max==b[z]) {
				cnt++;
				index=z;
			}
		}
		if(cnt>1) {
			System.out.println("?");
		}
		else {
			System.out.println((char)(index+65));
		}
		
	}

}
