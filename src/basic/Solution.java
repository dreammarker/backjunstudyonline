package basic;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

	public static void main(String[] args) throws Exception{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(); 
		for(int i=0;i<10;i++){
			String n= br.readLine();
			String wd= br.readLine();
			String word= br.readLine();
			int lineCnt = 0;
			int fromIndex = -1;
			while((fromIndex = word.indexOf(wd,fromIndex+1))>=0){
				lineCnt++;
			}
			sb.append("#"+n+" "+lineCnt+"\n"); 
		}
		System.out.print(sb);
		
	}

}
