package sevenlevel;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 백준2941크로아티아알파벳 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String insert= br.readLine().trim();
		int cnt=0;
		for(int i=0;i<insert.length();i++){
			char q=insert.charAt(i);
			if(q=='c'){
				if(insert.charAt(i+1)=='='||insert.charAt(i+1)=='-'){
					i++;
				}
			}
			else if(q=='d'){
				if(insert.charAt(i+1)=='-'){
					i++;
				}else if(insert.charAt(i+1)=='z'&&insert.charAt(i+2)=='='){
					i++;
					i++;
				}
			}
			else if(q=='l'){
				if(insert.charAt(i+1)=='j'){
					i++;
				}
			}
			else if(q=='n'){
				if(insert.charAt(i+1)=='j'){
					i++;
				}
			}else if(q=='s'){
				if(insert.charAt(i+1)=='='){
					i++;
				}
			}else if(q=='z'){
				if(insert.charAt(i+1)=='='){
					i++;
				}
			}
			cnt++;
		}
		System.out.println(cnt);
	}

}
