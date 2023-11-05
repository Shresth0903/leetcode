class Solution {
    public int subtractProductAndSum(int n) {
        int r =0;
        int res = n;
        int sum = 0;
        int prod = 1;

        while(res>0){
            r = res%10;
            res = res/10;
            sum+=r;
            prod*=r;

        }
        return (prod-sum);
    }
}