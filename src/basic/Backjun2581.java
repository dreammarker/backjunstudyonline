package basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Backjun2581 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n1 = Integer.parseInt(br.readLine());
		int n2 = Integer.parseInt(br.readLine());
		int check = 1;
		int sum = 0;
		
		for(int i=n1;i<=n2;i++){
			check=1;
			int aa=(int)Math.ceil(Math.sqrt(i));
			for(int j=1;j<=aa;j++){
				if(i%j==0){ //소수판별
					check=0;
					continue;
				}
			}
			if(check==1)
			sum+=i;
		}
		System.out.println(sum);
	}

}
