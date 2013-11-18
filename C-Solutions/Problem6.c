#include<stdio.h>
int main()
{
    unsigned long num1, sum1=0, sum2=0, i, ans;
    for(i = 1; i<= 100 ; i++)
    {
        sum1 = sum1 + (i*i);
        sum2 = sum2 + i;
    }
    ans = sum2*sum2 - sum1;
    printf("%u",ans);
    return 0;
}
