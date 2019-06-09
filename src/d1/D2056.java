package d1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Calendar;

public class D2056 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Calendar cal = Calendar.getInstance();
		int n = new Integer(br.readLine());
		for(int i=0;i<n;i++){
			String nun =br.readLine();
			
			int year = new Integer(nun.substring(0,4));
			int month = new Integer(nun.substring(4, 6));
			if(month<1||month>12) {
				bw.write("#"+(i+1)+" -1\n");
				continue;
			}
			cal.set(Calendar.YEAR, year);
			cal.set(Calendar.MONTH,month-1);
			int date = new Integer(nun.substring(6));
			if(date>=1&&date<=cal.getActualMaximum(Calendar.DAY_OF_MONTH)) {
				bw.write("#"+(i+1)+" "+nun.substring(0,4)+"/"+nun.substring(4, 6)+"/"+nun.substring(6)+"\n");
			}else {
				bw.write("#"+(i+1)+" -1\n");
				continue;
			}
		}
		bw.close();

	}

}
