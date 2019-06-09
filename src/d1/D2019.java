package d1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class D2019 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = new Integer(br.readLine());
		int m = 1;
		bw.write(m+" ");
		for(int i=1;i<=n;i++) {
			m=m*2;
			bw.write(m+" ");
		}
		bw.close();
	}

}
