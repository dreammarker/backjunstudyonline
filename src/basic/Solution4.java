package basic;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Solution4 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int i=0;i<10;i++){
			int n = Integer.parseInt(br.readLine());
			String num[] = br.readLine().split(" ");
			int n1[] = new int [100];
			//int 타입 변환
			for(int a=0;a<num.length;a++){
				n1[a]=Integer.parseInt(num[a]);
			}
			
			Arrays.sort(n1);
			for(int j=0;j<n;j++){
				n1[0]++;
				n1[99]--;
				Arrays.sort(n1);
			}
			bw.write("#"+(i+1)+" "+(n1[99]-n1[0])+"\n");
		}
		bw.close();
	}

}
