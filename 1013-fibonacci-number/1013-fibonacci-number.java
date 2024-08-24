class Solution {
    public int fib(int n) {
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }
             int firstnum = 0;
             int secondnum = 1;

           for (int i = 0; i < n; i++) {
            // Swap
            int num3 = secondnum + firstnum;
            firstnum = secondnum;
            secondnum = num3;
        }
        return firstnum;
    }
}