package basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Eratos {

	public static void main(String[] args) throws Exception{
		//ArrayList로 구현
		ArrayList<Boolean> primeList;
		// 입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		//n<=1일때 종료
		if(n<=1) return;
		//n+1만큼 할당
		primeList = new ArrayList<Boolean>(n+1);
		//0번째와 1번째를 소수 아님으로 처리
		primeList.add(false);
		primeList.add(false);
		//2~n까지 소수로 설정
		for(int i=2;i<=n;i++){
			primeList.add(i,true);
		}
		for(int i=2;i<=Math.ceil(Math.sqrt(n));i++){
			if(primeList.get(i)){
				for(int j=i*i;j<=n;j+=i)
					primeList.set(j, false);
			}
		}
		StringBuffer sb = new StringBuffer();
		sb.append("{");
		for(int i=0;i<=n;i++){
			if(primeList.get(i)==true){
				sb.append(i);
				sb.append(",");
			}
		}
		sb.setCharAt(sb.length()-1, '}');
		System.out.println(sb.toString());
	}

}
