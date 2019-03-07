package basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Backjun1373 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n = br.readLine();
		StringBuilder sb = new  StringBuilder();
		int cnt =0;
		int sum=0;
		for(int i=n.length()-1;i>=0;i--){
			cnt++;
			if(n.charAt(i)=='1'){
				if(cnt==1){
					sum+=1;
				}
				else if(cnt==2){
					sum+=2;
				}
				else if(cnt==3){
					sum+=4;
				}
			}
			if(cnt==3){
				sb.append(sum+"");
				cnt=0;
				sum=0;
			}else if(i==0){
				sb.append(sum+"");
			}
			
		}
		System.out.println(sb.reverse());
	}

}
