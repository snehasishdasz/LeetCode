class Solution {
    public int tribonacci(int n) {
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }else{
            int Faststterm=0;
            int Seconfndterm=1;
            int Thirdrdterm=1;
            for(int i=1;i<=n;i++){
                int Fourthterm = Faststterm + Seconfndterm + Thirdrdterm;
                Faststterm = Seconfndterm;
                Seconfndterm = Thirdrdterm;
                Thirdrdterm = Fourthterm;
            }
            return Faststterm;
        }
    }
}