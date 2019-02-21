package basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Backjun2775 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int count = Integer.parseInt(br.readLine());

			int arr[][] = new int [15][15];
			for(int q=0;q<15;q++) {
				arr[q][0] =1;
				arr[0][q] =q+1;
			}
			for(int j=1;j<15;j++) {
				for(int z=1;z<15;z++) {
					arr[j][z] =arr[j-1][z]+arr[j][z-1];
				}
			}
			for(int i=0;i<count;i++) {
				int h = Integer.parseInt(br.readLine());
				int n = Integer.parseInt(br.readLine())-1;
				 sb.append(arr[h][n]+"\n");
			}
			System.out.print(sb);
	}

}
