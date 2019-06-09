package basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

public class Backjun11650 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int num[][]= new int [n][2];
		for(int i=0;i<n;i++){
			String n1[] = br.readLine().split(" ");
			num[i][0]=Integer.parseInt(n1[0]);
			num[i][1]=Integer.parseInt(n1[1]);
		}
		//비교함수 
		Arrays.sort(num, new Comparator<int[]>(){
			@Override
			public int compare(int[] x, int[] y) {
				//x좌표가 같으면 y좌표가 작은 것을 return
				if(x[0]==y[0]){
					return Integer.compare(x[1], y[1]);
				}
				//아닐경우 x좌표가 작은것을 리턴
				return Integer.compare(x[0],y[0]);
			}
			
		});
		for(int i=0;i<n;i++){
			bw.write(num[i][0]+" "+num[i][1]+"\n");
		}
		bw.close();
		
		
	}

}
