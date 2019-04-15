package d1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class D2071 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = new Integer(br.readLine());
		for(int i=0;i<n;i++){
			String nun[] =br.readLine().split(" ");
			double sum = 0;
			for(int j=0;j<nun.length;j++){
				sum+=new Integer(nun[j]);
			}
			bw.write("#"+(i+1)+" "+Math.round(sum/nun.length)+"\n");
		}
		bw.close();
	}

}
