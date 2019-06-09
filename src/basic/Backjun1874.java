package basic;

import java.io.*;

public class Backjun1874 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder  sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		int temp; //입력한 값
		int max = 0; // stack안에서 제일 큰 값
		int top = 0; //stack에서 최상단에 있는 값
		int[] stack = new int[n];
		
		while(n-->0){ //입력받은 값의 수가 0보다 클 때 까지
			temp = Integer.parseInt(br.readLine());
			if(temp > max){
				//스택에 값이 없을 경우
				for(int i=max+1;i<=temp;i++){
					stack[top++] = i;
					sb.append("+\n"); //push
				}
				max = temp;
			}else if(stack[top-1] != temp){ //종료조건을 확인하기 위해
				System.out.println("NO");
				return;
			}
			//무조건 한번은 pop을 하기 떄문에
			top--;
			sb.append("-\n");
		}
		System.out.println(sb);
	}

}