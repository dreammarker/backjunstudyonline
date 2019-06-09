package basic;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution5 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num[][] = new int [100][100];
		
		for(int i=0;i<10;i++){
			int rowmax[]=new int [100];
			int colmax[]=new int [100];
			int dmax=0;
			String n = br.readLine();
			
			for(int a=0;a<100;a++){
				StringTokenizer st = new StringTokenizer(br.readLine());
				for(int b=0;b<100;b++){
					num[a][b]=Integer.parseInt(st.nextToken());
					rowmax[a]+=num[a][b];
					if(a==b){
						dmax+=num[a][b];
					}
				}
			}
			for(int a=0;a<100;a++){
				for(int b=0;b<100;b++){
					colmax[a]+=num[b][a];
				}
			}
			
			Arrays.sort(rowmax);
			Arrays.sort(colmax);
			bw.write("#"+n+" "+Math.max(rowmax[99], Math.max(colmax[99], dmax))+"\n");
		}
		bw.close();
	}

}
