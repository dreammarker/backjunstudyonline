package d1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class D2025 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = new Integer(br.readLine());
		System.out.println((n*(n+1))/2);
	}

}
