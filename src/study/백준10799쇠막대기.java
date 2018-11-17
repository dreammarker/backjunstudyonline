package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class 백준10799쇠막대기 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String bar[]  = br.readLine().trim().split("");
		Stack<Integer> stack= new Stack<>();
		int ans=0;
		for(int i=0;i<bar.length;i++) {
			if(bar[i].equals("("))
			stack.push(i);
			else {
				//peek c의 스택 top기능을 하고 있다
				if(stack.peek()+1==i) {
					stack.pop();
					ans+=stack.size();
				}else {
					stack.pop();
					ans+=1;
				}
			}
		}
		
		System.out.println(ans);
	}

}
