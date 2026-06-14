class Solution {
    public int addDigits(int num) {
      
        while(num>=10){
              int singledigit = 0;
              while(num>0){
            int rem = num%10;
            singledigit+=rem;
            num = num/10;
              }
            
            num = singledigit;
        }
        return num;
    }
    
}