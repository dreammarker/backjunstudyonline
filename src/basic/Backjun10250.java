package basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Backjun10250 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder builder = new StringBuilder();
		int count = Integer.parseInt(br.readLine().trim());
		for(int i=0;i<count;i++) {
			String read[] = br.readLine().split(" ");
			int height =Integer.parseInt(read[0]);
			int customer = Integer.parseInt(read[2]);
			int floor =customer%height; //층
			String rootnumber =String.valueOf(customer/height+1) ; //방호수
			//꼭대기 층으로 배정될 경우
			if(floor==0) {
				floor = height;
				rootnumber = String.valueOf(customer/height);
			}
			if(rootnumber.length()==1) {
				rootnumber = "0"+rootnumber;
			}
			
			builder.append(floor+""+rootnumber+"\n");
		}
		System.out.println(builder);
	}

}
