package basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

public class Backjun10814 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//몇 번 반복??
		int n = Integer.parseInt(br.readLine());
		String num[][] = new String[n][2];
		for(int i=0;i<n;i++){
			String nu[] = br.readLine().split(" ");
			num[i][0]= nu[0];
			num[i][1]= nu[1];
		}
		Arrays.sort(num, new Comparator<String[]>() {
			@Override
			public int compare(String[] x, String[] y) {
				return Integer.compare(Integer.parseInt(x[0]), Integer.parseInt(y[0]));
			}
		});
		
		for(int i=0;i<n;i++)
		bw.write(num[i][0]+" "+num[i][1]+"\n");
		
		bw.close();
	}

}
