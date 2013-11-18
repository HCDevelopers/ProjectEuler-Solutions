#include<stdio.h>
long ar[5000];
void gen_penta()
{
    int i;
    for(i = 0 ; i < 5000 ; i++)
    {
        ar[i] = (i+1) * (3*(i+1) - 1) / 2;
    }
}
bool find_penta(long x)
{
    int i;
    for(i = 0 ; i < 5000 ; i++)
    {
        if(x == ar[i])
            return true;
    }
    return false;
}
long start()
{
    gen_penta();
    int i, j;
    for(i = 0; i < 4999 ; i++)
    {
        for(j = i+1 ; j < 4999 ; j++)
        {
            if(find_penta(ar[j] + ar[i]) && find_penta(ar[j] - ar[i]))
            {
                printf("%u & %u",ar[j], ar[i]);
                return (ar[j] - ar[i]);
            }
        }
    }
    return -1;
}
int main()
{
    long x = start();
    if(x != -1)
        printf("\nDifference : %u", x);
    else
        printf("Not found");
    return 0;
}
