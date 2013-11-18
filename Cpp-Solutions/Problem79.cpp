#include "stdafx.h"
#include <string>
#include <iostream>

#define N 50

void Problem79()
{
    std::string comb[N] =
        #pragma region Initializer
            {
                "319", "680", "180", "690", "129", "620", "762", "689", "762", "318", "368", "710",
                "720", "710", "629", "168", "160", "689", "716", "731", "736", "729", "316", "729",
                "729", "710", "769", "290", "719", "680", "318", "389", "162", "289", "162", "718",
                "729", "319", "790", "680", "890", "362", "319", "760", "316", "729", "380", "319",
                "728", "716"
            };
        #pragma endregion

    std::string  pass = comb[0];
    for (int i = 1; i < N; i++)
    {
        std::string digits = comb[i];

        if (pass[0] == digits[2])
            pass = digits + pass.substr(1);
        else if (pass[pass.length() - 1] == digits[0])
            pass += digits.substr(0, 2);
        else if (pass.substr(0, 2) == digits.substr(1))
            pass = digits[0] + pass;
        else if (pass.substr(pass.length() - 2) == digits.substr(0, 2))
            pass += digits[2];
        else
        {
            std::string findNums = digits;
            findNums.replace(1, 1, "");
            int x = pass.find(findNums);
            if (x > -1)
                pass.replace(x,2,digits);
        }
    }
    std::cout << "Ans: " << pass << std::endl;
}

int main(const char* args)
{
    Problem79();
}
