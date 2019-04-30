package d1;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class D2027 {

	public static void main(String[] args) throws Exception{
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write("#++++\r\n" + 
				"+#+++\r\n" + 
				"++#++\r\n" + 
				"+++#+\r\n" + 
				"++++#");
		bw.close();
	}

}
