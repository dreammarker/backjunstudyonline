package basic;

import java.util.Calendar;

public class Twoxtirelingtwo {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		for(int i =0;i<12;i++){
			cal.set(2018, i,1);
//			System.out.print(cal.getActualMaximum(Calendar.DAY_OF_MONTH)+ ", ");
		}
		for(int i=1;i<10000;i++){
			System.out.print(Math.floor(Math.random()*31)+" ,");
		}
	}

}
