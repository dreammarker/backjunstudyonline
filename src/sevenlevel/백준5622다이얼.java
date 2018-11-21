package sevenlevel;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 백준5622다이얼 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String number = br.readLine().trim();
		int sum=0;
		for(int i=0;i<number.length();i++){
			if(number.charAt(i)=='0'){
				sum+=10;
			}else if(number.charAt(i)=='1'){
				sum+=1;
			}else{
				sum+=check(number.charAt(i));
			}
		}
		sum+=(int)number.length();
		
		System.out.print(sum);
	}
	//static을 안붙이면 객체를 생성해야함.
	static int check(char c){
		int num=0;
		
		switch(c){
			case 'A':
			case 'B':
			case 'C':
				num=2;
				break;
			case 'D':
			case 'E':
			case 'F':
				num=3;
				break;
			case 'G':
			case 'H':
			case 'I':
				num=4;
				break;
			case 'J':
			case 'K':
			case 'L':
				num=5;
				break;
			case 'M':
			case 'N':
			case 'O':
				num=6;
				break;
			case 'P':
			case 'Q':
			case 'R':
			case 'S':
				num=7;
				break;
			case 'T':
			case 'U':
			case 'V':
				num=8;
				break;
			case 'W':
			case 'X':
			case 'Y':
			case 'Z':
				num=9;
				break;
			default:
				break;
		}
		return num;
	}

}
