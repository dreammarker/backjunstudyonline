package basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Gravity {
	static int empty = 0;
	static int box = 1 ;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int i;
		int testCase, T;
		int roomWidth, roomHeight;
		int maxFallen;
		int room[][] = new int [100][100];
		int boxTop[] = new int [100];
		int countEmptySpace;
		testCase = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(T = 0;T<testCase;T++){
			roomWidth=Integer.parseInt(st.nextToken());
			roomHeight= Integer.parseInt(st.nextToken());
			maxFallen = 0;
			for(int a=0;a<roomWidth;a++){
				
			}
		}
		
	}

}
