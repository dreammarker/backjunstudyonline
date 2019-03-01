package basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Backjun1929 {
	
	public static void main(String[] args) throws Exception{

				//ArrayList로 구현
				ArrayList<Boolean> primeList;
				// 입력
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				String num[] =br.readLine().split(" ");
				int n1 = Integer.parseInt(num[0]);
				int n2 = Integer.parseInt(num[1]);
				//n+1만큼 할당
				primeList = new ArrayList<Boolean>(n2+1);
				//0번째와 1번째를 소수 아님으로 처리
				primeList.add(false);
				primeList.add(false);
				//2~n까지 소수로 설정
				for(int i=2;i<=n2;i++){
					primeList.add(i,true);
				}
				for(int i=2;i<=Math.ceil(Math.sqrt(n2));i++){
					if(primeList.get(i)){
						for(int j=i*i;j<=n2;j+=i)
							primeList.set(j, false);
					}
				}
				StringBuffer sb = new StringBuffer();
				for(int i=n1;i<=n2;i++){
					if(primeList.get(i)==true){
						sb.append(i+"\n");
					}
				}
				System.out.println(sb.toString());
			}

		

	}
