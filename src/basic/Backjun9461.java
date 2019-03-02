	package basic;
	
	import java.io.BufferedReader;
	import java.io.BufferedWriter;
	import java.io.InputStreamReader;
	import java.io.OutputStreamWriter;
import java.util.Arrays;
	
	public class Backjun9461 {
	
		public static void main(String[] args) throws Exception{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			 long[] d = {0,1,1,1,2,2,3,4,5,7,9};
			 d = Arrays.copyOf(d, 101);
			 for(int i=10;i<=100;i++) {
				 d[i] = d[i-1] + d[i-5];
			 }
			 int t = Integer.parseInt(br.readLine());
			 while(t-->0) {
				 int n = Integer.parseInt(br.readLine());
				 bw.write(d[n]+"\n");
			 }
			 bw.close();
		}
	
	}
