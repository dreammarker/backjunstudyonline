package basic;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Beakjoon1001 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++){
			String num[] = br.readLine().split(" ");
			int n1 = Integer.parseInt(num[0]);
			int n2 = Integer.parseInt(num[1]);
			int nu[][] = new int [n1+1][n2+1];
			// n1<=n2
			for(int a=1;a<=n1;a++){
				for(int b=a;b<=n2;b++){
					if(a==1)
						nu[a][b] = b;
					else {
						nu[a][b]+=nu[a-1][b-1]+nu[a][b-1];
					}
				}
			}
			bw.write(nu[n1][n2]+"\n");
		}
		bw.close();
	}

}
