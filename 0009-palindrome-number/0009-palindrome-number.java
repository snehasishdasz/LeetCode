class Solution {
    public boolean isPalindrome(int x) {
        String num = Integer.toString(x);
        StringBuilder r_num = new StringBuilder(num);
        r_num.reverse();
        if(num.equals(r_num.toString())){
            return true;
        }
        return false;
    }
}