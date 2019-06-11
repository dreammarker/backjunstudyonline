package d1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D1936 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = new Integer(st.nextToken());
		int m = new Integer(st.nextToken());
		if(n==1&&m==2) { //1가위 2바위 3보
			System.out.print("B");
		}
		else if(n==1&&m==3) {
			System.out.print("A");
		}
		else if(n==2&&m==1) {
			System.out.print("A");
		}
		else if(n==2&&m==3) {
			System.out.print("B");
		}
		else if(n==3&&m==1) {
			System.out.print("B");
		}
		else if(n==3&&m==2) {
			System.out.print("A");
		}
	}

}
