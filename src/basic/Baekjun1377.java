package basic;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Baekjun1377 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int num[][] = new int [n][2];
		for(int i=0;i<n;i++){
			num[i][0] = Integer.parseInt(br.readLine());
			num[i][1] = i;
		}
		Arrays.sort(num, new Comparator<int []>() {

			@Override
			public int compare(int[] x, int[] y) {
				return Integer.compare(x[0], y[0]);
			}
		});
		int max=0;
		for(int i=0;i<n;i++){
			if(max<num[i][1]-i){
			    max= num[i][1]-i;
			}
		}
		System.out.println(max+1);
	}
}
