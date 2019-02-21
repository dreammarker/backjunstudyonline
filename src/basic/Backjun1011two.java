package basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
// 참고: https://zetawiki.com/wiki/BOJ_1011_Fly_me_to_the_Alpha_Centauri
public class Backjun1011two {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(reader.readLine());
		StringBuilder builder = new StringBuilder();
		 
		for(int i=0 ; i<T ; i++){
			String[] rocation = reader.readLine().split(" ");
			int distance = Integer.parseInt(rocation[1]) - Integer.parseInt(rocation[0]);
			int result = (int)(Math.sqrt(distance-0.5)*2.0);
			builder.append(result).append("\n");
		}
		
		System.out.println(builder);
	}
}