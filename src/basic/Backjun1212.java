package basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Backjun1212 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String num = br.readLine();
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<num.length();i++){
			int n1=num.charAt(i)-'0';
			if(i!=0){
				if(n1==0){
					sb.append("000");
				}
				else if(n1==1){
					sb.append("001");
				}
				else if(n1==2){
					sb.append("010");
				}
				else if(n1==3){
					sb.append("011");
				}
				else if(n1==4){
					sb.append("100");
				}
				else if(n1==5){
					sb.append("101");
				}
				else if(n1==6){
					sb.append("110");
				}
				else if(n1==7){
					sb.append("111");
				}
			}
			else{
				 if(n1==1){
					sb.append("1");
				}
				else if(n1==2){
					sb.append("10");
				}
				else if(n1==3){
					sb.append("11");
				}
				else if(n1==4){
					sb.append("100");
				}
				else if(n1==5){
					sb.append("101");
				}
				else if(n1==6){
					sb.append("110");
				}
				else if(n1==7){
					sb.append("111");
				}
			}
			
		}
		System.out.println(sb);
		
	}

}
