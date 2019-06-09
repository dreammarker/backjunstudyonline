package basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Palindrome {

	public static void main(String[] args) throws Exception{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//회문의 길이가 주어진다.
		for(int a=0;a<10;a++){
			int len = new Integer(br.readLine());
			char arr[][] = new char [8][8];
			for(int i=0;i<8;i++){
				StringTokenizer st = new StringTokenizer(br.readLine());
				arr[i]			   = st.nextToken().toCharArray();
			}//값을 집어 넣는 부분
			int count = 0; //count 초기화

			for(int s=0;s<8-len+1;s++){ //회문의 길이에 따라서 조회하는 길이가 다르다..
				boolean flag;
				//arr[0][j~
				for(int i=0; i<8; i++){
					flag = true;
					for(int j=0;j<len/2;j++){
						if(arr[i][s+j]!=arr[i][s+len-1-j]){
							flag = false;
							break;
						}
					}
					if(flag) count++;
					flag = true;
					for(int j=0;j<len/2;j++){
						if(arr[s+j][i]!=arr[s+len-1-j][i]){
							flag = false;
							break;
						}
						
					}
					if(flag ) count++;
				}
				
			}
			bw.write("#"+(a+1)+" "+count+"\n");
			
			
		}
		
		
	}

}
