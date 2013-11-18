#include<stdio.h>
bool isdiv(unsigned long n)
{
    int x;
    for(x = 1; x <= 20 ; x++)
    {
        if(n % x != 0)
        {
            return false;
        }
    }
    return true;
}
int main()
{
    unsigned long loop = 2520;
    while(1)
    {
        if(isdiv(loop))
        {
            printf("%u",loop);
            break;
        }
        loop+=20;
    }
    return 0;
}
