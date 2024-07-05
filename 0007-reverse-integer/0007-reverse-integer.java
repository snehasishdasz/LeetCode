class Solution {
    public int reverse(int x) {
        int rev=0;
        int Lastdigit;
       while(x!=0){
            Lastdigit = x%10;
            x=x/10;
           if(rev > Integer.MAX_VALUE/10 || rev  < Integer.MIN_VALUE/10){return 0;}
           rev = (rev*10)+Lastdigit;
        }
        return rev;
    }
}