package basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjun2331 {
	//체크할 그릇 지정
	public static int []check = new int [1000000];
	//제곱
//	public static int pow(int x, int p){
//		int ans = 1;
//		for(int i=0;i<p;i++){
//			ans = ans * x;
//		}
//		return ans;
//	}
	public static int next(int a,int p){
		int ans = 0; //일단 리턴할 값을 0으로 초기화
		while(a > 0){
			ans+= Math.pow(a%10,p); // 10으로 나눈 나머지를 제곱한다 
			a/=10;  //a= 10으로 나눈몫 몫이 0보다 작을경우엔 다시 제곱해야하므로 이걸만든건가..?
		}
		return ans;
	}
	//a는 시작 위치값 p제곱 값 cnt는 횟수
	public static int length(int a, int p ,int cnt){
		if(check[a]!=0){
			return check[a] -1; //그값이 0이아닐때 반복순열이 끝날떄를 의미..
		}
		check[a] = cnt; //cnt  값을 집어 넣는다
		int b = next(a,p); 
		return length(b,p,cnt+1);
	}
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int p = Integer.parseInt(st.nextToken());
		System.out.println(length(a,p,1));
	}

}
