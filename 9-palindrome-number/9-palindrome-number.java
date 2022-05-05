class Solution {
    public boolean isPalindrome(int x) {
        int num=x,a;
        if(num<0){
            return false;
        }else if(num==0){
            return true;    
        }
        else
        {
        a=num%10;
        while(!(num/10<1)){
            num=num/10;
            a=a*10+num%10;
        }
        if(a==x)
            return true;
        else return false;
        
    }}
}