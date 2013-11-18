def fibonacci(n):
    if n < 0:
        raise ValueError("Negative arguments not implemented")
    return _fib(n)[0]

def _fib(n):
    if n == 0:
        return (0, 1)
    else:
        a, b = _fib(n / 2)
        c = a * (2 * b - a)
        d = b * b + a * a
        if n % 2 == 0:
            return (c, d)
        else:
            return (d, c + d)

def digits(num):
    d = 0
    while num:
        d += 1
        num/=10
    return d

n = 1
f = 1
while digits(f) < 1000:
    f = fibonacci(n)
    n += 1

print n - 1
