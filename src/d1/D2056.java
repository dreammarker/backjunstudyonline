package d1;

import java.io.BufferedReader;
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
	}

}
