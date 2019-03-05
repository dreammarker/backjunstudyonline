package basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Backjun10430 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String n[] = br.readLine().split(" ");
		
		int a = Integer.parseInt(n[0]);
		int b = Integer.parseInt(n[1]);
		int c = Integer.parseInt(n[2]);
		bw.write((a+b)%c+"\n");
		bw.write((a+b)%c+"\n");
		bw.write((a*b)%c+"\n");
		bw.write((a*b)%c+"");
		bw.close();
		
	}

}
