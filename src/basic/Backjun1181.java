package basic;

import java.io.*;
import java.util.Arrays;

public class Backjun1181 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader( System.in ) );
        StringBuffer sb = new StringBuffer();

        int n = Integer.parseInt( br.readLine() );

        Words[] list = new Words[n];

        for( int i = 0 ; i < n ; ++i )
            list[i] = new Words( br.readLine() );

        Arrays.sort( list );

        String tmp = "";

        for(Words w : list){
            String target = w.getWord();
            if( !tmp.equals(target) ){
                sb.append( target + "\n" );
                tmp = target;
            }
        }

        System.out.println(sb);

    }
}

class Words implements Comparable<Words>{

    private String word;

    Words( String word ){
        this.word = word;
    }

    String getWord(){
        return this.word;
    }

    @Override
    public int compareTo(Words o) {
        int thisLen = this.word.length();
        int comLen = o.word.length();

        if( thisLen < comLen )
            return -1;
        else if( thisLen > comLen )
            return 1;
        else
            return this.word.compareTo( o.word );
    }
}
