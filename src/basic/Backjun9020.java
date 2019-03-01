package basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Backjun9020 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		ArrayList<Boolean> primeList = new ArrayList<>();
		primeList.add(false);
		primeList.add(false);
		for(int i=2;i<=10000;i++){
			primeList.add(true);
		}
		for(int i=2;i<=Math.sqrt(10000);i++){
			if(primeList.get(i)){
				for(int j=i*i;j<=10000;j+=i){
					primeList.set(j, false);
				}
			}
		}
		int n = Integer.parseInt(br.readLine());
		//두 소수의 차가 최소가 되면 된다..
		//골드바흐의 추측은 2보다 큰 모든 짝수는 두 개의 소수의 합으로 나타낼 수 있다는 것이다. 아직 정수론의 미해결 문제로 현재까지 10^18 이하에서 참이라는 것을 확인했다고 한다.
		//에라토스테네스의 체로 소수를 미리 구한후 n의 절반부터 줄여가면서 i와 n-i가 소수가 되는지 확인한다. 이 때 처음 발견하는 골드바흐 파티션이 두 소수의 차이가 최소이다.
		for(int i=0;i<n;i++){
			int num = Integer.parseInt(br.readLine());
			for(int j=num/2;j>=2;j--){
				if(primeList.get(j)&&primeList.get(num-j)){
					bw.write(j+" "+(num-j)+"\n");
					break;
				}
			}
		}
		bw.close();
		
	}
	
	

}
