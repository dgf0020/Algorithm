import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        Arrays.sort(phone_book);
        
		for (int i = 1; i < phone_book.length; i++) {
                    String a = phone_book[i];
                    String b = phone_book[i - 1];

                    if (a.startsWith(b)) {
                            return false;
                    }
		}
        
        return answer;
    }
}