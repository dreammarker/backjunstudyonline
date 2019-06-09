package hash;

	class Solution2 {
	    public static boolean solution(String[] phone_book) {
	    	 boolean answer = true;
	    	for(int i=0;i<phone_book.length;i++){
	    		for(int j=i+1;j<phone_book.length;j++){
	    			//속도개선
/*		    		if(phone_book[i].length()<phone_book[j].length()){
		    			if(phone_book[i].equals(phone_book[j].substring(0, phone_book[i].length()))){
		    				answer = false;
		    				break;
		    			}
		    		}
		    		else if(phone_book[i].length()>phone_book[j].length()){
		    			if(phone_book[j].equals(phone_book[i].substring(0, phone_book[j].length()))){
		    				answer = false;
		    				break;
		    		}
	    		}*/
	    		if(phone_book[i].startsWith(phone_book[j])){return false;}
	    		if(phone_book[j].startsWith(phone_book[i])){return false;}
	    	}
	    }
	        return answer;
	    }
	   
	}
	

