class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;
        int LD;
        int rev = 0;
        while(x>0){
            LD = x % 10;
            x = x/10;
            rev = (rev*10)+LD;
        }
        if(temp==rev){
            return true;
        }
        else{
            return false;
        }
}
}