package basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Backjun2750 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int array[] = new int [3];
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		for(int i=0;i<3;i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		int min, temp,index=0;
		for(int i=0;i<3;i++) {
			min = 1000001;
			for(int j=i ; j<3; j++) {
				if(min> array[j]) {
					min = array[j];
					index = j;
				}
			}
			temp = array[i];
			array[i] = array[index];
			array[index] = temp;
		}
		
		for(int i=0;i<3;i++) {
			System.out.print(array[i]+" ");
		}
	}
}
