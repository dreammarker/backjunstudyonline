package d1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class D2050 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String alpabet = br.readLine();
		for(int i=0; i<alpabet.length();i++) {
			bw.write((int)(alpabet.charAt(i)-64)+" ");
		}
		bw.close();
		
	}

}
