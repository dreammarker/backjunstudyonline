package basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Backjun1193 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine().trim());
		for(int i=1;i<5000;i++) {
			int av=i*(i+1)/2;
			
				if(av==num) {
					if(i%2==1) {
						bw.write("1/"+i);
						break;
					}else {
						bw.write(i+"/1");
						break;
					}
				}
				else if(av>num){
					int at = i*(i-1)/2;
					int ct =num-at-1;
					if(i%2==0) {
						bw.write((ct+1)+"/"+(-ct+i));
						break;
					}else {
						bw.write((-ct+i)+"/"+(ct+1));
						break;
					}
				}
				
		}
		bw.close();
	}

}
