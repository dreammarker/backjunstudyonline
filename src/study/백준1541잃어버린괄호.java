package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 백준1541잃어버린괄호 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String word = br.readLine();
		String num = "";
		int nums[] = new int [255];
		int cnt =0;
		char nsi[]=new char[255];
		int nscn =0 ;
		for(int i=0;i<word.length();i++){
			if(word.charAt(i)!='-'&&word.charAt(i)!='+'){
				num+=word.charAt(i);
				if(word.length()-1==i){
					nums[cnt] =new Integer(num);
					num ="";
				}
			}else{
				nsi[nscn] = word.charAt(i);
				nums[cnt] =new Integer(num);
				num ="";
				cnt++;
				nscn++;
			}
		}
		int result = nums[0];
		boolean ss = true;
		for(int j=0;j<=nscn;j++){
			if(nsi[j]=='-'){
				ss = false;
			}else {
				
			}
			if(ss==true){
				result+=nums[j+1];
			}else{
				result-=nums[j+1];
			}
		}
		System.out.println(result);
		
	}

}
