package basic;



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Solution3 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int i=0;i<10;i++){
			int n = Integer.parseInt(br.readLine());
			String num[] = br.readLine().split(" ");
			int count =0;
			int co=0;
			for(int j=2;j<n-2;j++){
				int max = Math.max(Math.max(Integer.parseInt(num[j-2]), Integer.parseInt(num[j-1])),Math.max(Integer.parseInt(num[j+1]),Integer.parseInt(num[j+2])));
				co++;
				if(Integer.parseInt(num[j])>max) count+=Integer.parseInt(num[j])-max;  
			}
			System.out.println(co);
			bw.write("#"+(i+1)+" "+count+"\n");
			
		}
		bw.close();
	}

}
