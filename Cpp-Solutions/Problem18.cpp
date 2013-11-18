#include <iostream>

using namespace std;

int main(const char* args)
{
    int numLevels = 15;

    int row0[]  = { 75 };
    int row1[]  = { 95, 64 };
    int row2[]  = { 17, 47, 82 };
    int row3[]  = { 18, 35, 87, 10 };
    int row4[]  = { 20, 4, 82, 47, 65 };
    int row5[]  = { 19, 1, 23, 75, 3, 34 };
    int row6[]  = { 88, 2, 77, 73, 7, 63, 67 };
    int row7[]  = { 99, 65, 4, 28, 6, 16, 70, 92 };
    int row8[]  = { 41, 41, 26, 56, 83, 40, 80, 70, 33 };
    int row9[]  = { 41, 48, 72, 33, 47, 32, 37, 16, 94, 29 };
    int row10[] = { 53, 71, 44, 65, 25, 43, 91, 52, 97, 51, 14 };
    int row11[] = { 70, 11, 33, 28, 77, 73, 17, 78, 39, 68, 17, 57 };
    int row12[] = { 91, 71, 52, 38, 17, 14, 91, 43, 58, 50, 27, 29, 48 };
    int row13[] = { 63, 66, 4, 68, 89, 53, 67, 30, 73, 16, 69, 87, 40, 31 };
    int row14[] = { 4, 62, 98, 27, 23, 9, 70, 98, 73, 93, 38, 53, 60, 4, 23 };

    int *pyramid[] = { row0, row1, row2, row3, row4, row5, row6, row7, row8, row9, row10, row11, row12, row13, row14 };

    for (int i = 1; i < numLevels; i++)
    {
        for (int j = 0; j < i + 1; j++)
        {
            if(j == 0)
                pyramid[i][j] = pyramid[i][j] + pyramid[i - 1][j];
            else if(j == i)
                pyramid[i][j] = pyramid[i][j] + pyramid[i-1][j-1];
            else
                pyramid[i][j] = pyramid[i][j] + (pyramid[i - 1][j] > pyramid[i - 1][j - 1] ? pyramid[i - 1][j] : pyramid[i - 1][j - 1]);
        }
    }

    int result = 0;
    for (int i = 0; i < numLevels; i++)
    {
        if (pyramid[numLevels-1][i] > result)
        {
            result = pyramid[numLevels-1][i];
        }
    }
    cout << "Ans: " << result << endl;

    char c = '\n';
    cin >> c;
    return 0;
}
