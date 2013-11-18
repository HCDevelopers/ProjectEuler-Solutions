#Problem15
def factorial(n):
    if n == 0:
        return 1
    else:
        return n * factorial(n-1)

def lattice_paths(a, b):
    n = a + b
    k = a
    return factorial(n)/(factorial(k) * factorial(n - k))

print lattice_paths(20, 20)
