package d1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class D2070 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = new Integer(br.readLine());
		for(int i=0;i<n;i++){
			String nun[] =br.readLine().split(" ");
			int n1 = new Integer(nun[0]);
			int n2 = new Integer(nun[1]);
			if(n1>n2){
				bw.write("#"+(i+1)+" "+">"+"\n");
			}
			else if(n1==n2){
				bw.write("#"+(i+1)+" "+"="+"\n");
			}
			else{
				bw.write("#"+(i+1)+" "+"<"+"\n");
			}
		}
		bw.close();
	}

}
