class Solution {
    public int reverse(int x) {

        int n = x;
        long revNum = 0;

        while (n != 0) {

            int digit = n % 10;
            revNum = revNum * 10 + digit;
            n = n / 10;
        }

        if (revNum > Integer.MAX_VALUE || revNum < Integer.MIN_VALUE) {
            return 0;
        }

        return (int) revNum;
    }
}