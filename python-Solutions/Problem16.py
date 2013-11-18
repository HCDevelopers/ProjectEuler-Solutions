x = 2**(1000)
sum = 0
while x:
    sum += x % 10
    x /= 10
print sum
