package basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Backjun11576 {
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void convert(int num, int base) {
        if (num == 0) {
            return;
        }
        convert(num/base, base);
        System.out.print(num%base + " ");
    }
    public static void main(String args[]) throws Exception{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	String num[] = br.readLine().split(" ");
    	int a = Integer.parseInt(num[0]);
    	int b = Integer.parseInt(num[1]);
    	int n = Integer.parseInt(br.readLine());

    	int ans = 0;
    	String num1[] = br.readLine().split(" ");
        for (int i = 0; i<n; i++) {
            int x = Integer.parseInt(num1[i]);
            ans = ans * a + x;
        }
        convert(ans, b);
        System.out.println();
    }
}