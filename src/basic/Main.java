package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class Main{
   public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       int n = Integer.parseInt(br.readLine());
       boolean b[] = new boolean[2000001];
       for (int i = 0; i < n; i++) {
           int a = Integer.parseInt(br.readLine()) + 1000000;
           b[a] = true;
       }
       StringBuilder sb = new StringBuilder();
       for(int i=0;i<2000001; i++){
          if(b[i]) sb.append(i-1000000+"\n");
       }
       System.out.println(sb);
   }
}
