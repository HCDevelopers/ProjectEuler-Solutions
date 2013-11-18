#include "stdafx.h"
#include <iostream>
#include <math.h>
#include <vector>

bool isPrime(int n)
{
    if (n < 0) n = -n;
    for (int i = 2; i * i <= n; i++)
    {
        if (n / i - (n - 1) / i == 1) return false;
    }
    return true;
}

void Problem27()
{
    // n^2 + an + b, where |a| < 1000 and |b| < 1000
    // Find the product of the coefficients (a, b)
    // for the expression that produces the maximum # primes
    // for consecutive values of n, starting with n = 0.

    std::vector<int> primes;
    for (int i = 3; i < 1000; i+=2) if (isPrime(i)) primes.push_back(i);

    int product = 0, primeCount = 0, n;
    for(int a = -999; a < 1000; a+=2)
    {
        for(std::vector<int>::iterator b = primes.begin() ; b != primes.end(); b++)
        {
            n = 0;
            while(isPrime(n*(n+a)+*b)) n++;
            if(n > primeCount) { primeCount = n; product = a * *b; }
        }
    }
    std::cout << "Ans: " << product << std::endl;
}

int main(const char* args)
{
    Problem27();
    std::cin.get();
    return 0;
}
