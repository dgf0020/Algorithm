class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int tmp = 0;
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[i] > array[j]) {
                    tmp = array[j];
                    array[j] = array[i];
                    array[i] = tmp;
                }
            }
        }
        
        return array[array.length / 2];
    }
}