#include "stdafx.h"
#include <iostream>
#include <map>

#define N26 1000
void Problem26()
{
    int arr[2], n;
    std::map<int, int> m;

    for (int i = 1; i < N26; i++)
    {
        n = 10;
        for (int j = 0; j < 1000; j++)
        {
            n = 10 * (n % i);
            if (m.find(n) == m.end())
            {
                m.insert(std::pair<int,int>(n, j));
            }
            else
            {
                int cycles = j - m.at(n);
                if (cycles > arr[0]) 
                {
                    arr[0] = cycles;
                    arr[1] = i;
                }
                break;
            }
        }
        m.clear();
    }

    std::cout << "Ans: d = " << arr[1] << " with " << arr[0] << " cycles." << std::endl;
}
