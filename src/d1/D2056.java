package d1;

import java.io.BufferedReader;
<<<<<<< HEAD
import java.io.InputStreamReader;
import java.sql.Date;

public class D2056 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n1 =new Integer(br.readLine());
		int sum =0;
		for(int i=0;i<n1;i++){
			String n = br.readLine();
			int year = new Integer(n.substring(0, 4));
			int month= new Integer(n.substring(4, 6));
			int date = new Integer(n.substring(6));
			Date date1 = new Date(year,month,date);
			System.out.println(date1);
		}
=======
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

>>>>>>> branch 'master' of https://github.com/dreammarker/backjunstudyonline.git
	}

}
