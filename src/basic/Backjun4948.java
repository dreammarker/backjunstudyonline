package basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Backjun4948 {
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Boolean> primeList;
		int cnt=0;
		while(true){
			int n = Integer.parseInt(br.readLine());
			if(n==0){
				break;
			}
			else{
				primeList = new ArrayList<Boolean>((2*n)+1);
				//0번째와 1번째를 소수 아님으로 처리
				primeList.add(false);
				primeList.add(false);
				//2~n까지 소수로 설정
				for(int i=2;i<=2*n;i++){
					primeList.add(i,true);
				}

				for(int i=2;i<=Math.sqrt(2*n);i++){
					if(primeList.get(i)){
						for(int j=i*i;j<=(2*n);j+=i)
							primeList.set(j, false);
					}
				}
				for(int i=n;i>0;i--){
					primeList.set(i,false);
				}
				for(int i=0;i<=2*n;i++){
					if(primeList.get(i)==true){
						cnt++;
					}
				}
				System.out.println(cnt);
				cnt=0;
			}
		}
	}
}
