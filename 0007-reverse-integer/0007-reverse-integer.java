class Solution {
    public int reverse(int x) {
        int result = 0;
while (x != 0) {
    int rem = x % 10;      // get last digit
    x = x / 10;            // remove last digit
    // check overflow before multiplying
    if (result > Integer.MAX_VALUE / 10) return 0;
    if (result < Integer.MIN_VALUE / 10) return 0;
    result = result * 10 + rem;  // build reversed number
}
return result;
    }
}