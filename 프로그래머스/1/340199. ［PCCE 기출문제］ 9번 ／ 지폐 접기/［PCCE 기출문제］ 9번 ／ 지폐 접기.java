class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        
        int wmax = Math.max(wallet[0], wallet[1]);
        int wmin = Math.min(wallet[0], wallet[1]);
        
        int bmax = Math.max(bill[0], bill[1]);
        int bmin = Math.min(bill[0], bill[1]);
        
        while (bmin > wmin || bmax > wmax) {
            bmax /= 2;
            answer++;
            
            int bb = bmax;
            int b = bmin;
            
            bmin = (b < bb) ? b : bb;
            bmax = (b < bb) ? bb : b;
            
        }
        
        return answer;
    }
}