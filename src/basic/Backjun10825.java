package basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

public class Backjun10825 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		String num[][] = new String[n][4];
		for(int i=0;i<n;i++){
			String n1[] = br.readLine().split(" ");
			num[i][0] = n1[0]; //이름
			num[i][1] = n1[1]; //국어
			num[i][2] = n1[2]; //영어
			num[i][3] = n1[3]; //수학
		}
		Arrays.sort(num, new Comparator<String []>() {

			@Override
			public int compare(String[] x, String[] y) {
				if(Integer.parseInt(x[1])==Integer.parseInt(y[1])){ //국어 점수가 같으면
					if(Integer.parseInt(x[2])==Integer.parseInt(y[2])){ //영어점수가 같으면
						if(Integer.parseInt(x[3])==Integer.parseInt(y[3])){ //수학점수가 같으면
							//국, 영, 수 점수가 같으면...
							return x[0].compareTo(y[0]); //compareTo 사전 오름차순 이것도 내림차순일떄 y, x
						}
						//국어점수 같고 영어점수 같을 떄 , 수학 점수는 내림차순 내림차순일때 순서 바꿈
						return Integer.compare(Integer.parseInt(y[3]),Integer.parseInt(x[3]));
					} 
					//국어점수 같을때  //영어점수 올림차순
					return Integer.compare(Integer.parseInt(x[2]), Integer.parseInt(y[2]));
				}
				//국어점수는 내림차순
				return Integer.compare(Integer.parseInt(y[1]), Integer.parseInt(x[1]));
			}
		});
		
		for(int i=0;i<n;i++){
			bw.write(num[i][0]+" "+"국어"+num[i][1]+"영어"+num[i][2]+"수학"+num[i][3]+"\n");
		}
		bw.close();
	}

}
