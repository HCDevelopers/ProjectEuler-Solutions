int Pentagon(int n)
{
    return n * (3 * n - 1) / 2;
}

bool AllPentagonal(int x, int y)
{
    double dx = ((sqrt(24 * x + 1) + 1) / 6);
    double dy = ((sqrt(24 * y + 1) + 1) / 6);
    return dx == (int)dx && dy == (int)dy;
}

int main()
{
    int hi = 2500;
    int ans = INT_MAX;
    for (int i = 1; i <= hi; i++)
    {
        for (int j = i + 1; j <= hi; j++)
        {
            int p[] = { Pentagon(i), Pentagon(j) };
            int d = p[1] - p[0];
            if (d > ans) break;

            if (AllPentagonal(d, p[0] + p[1]))
            {
                ans = d;
            }
        }
    }
    std::cout << ans << std::endl;
    char c = '\n';
    std::cin >> c;
}
