count, num, deno, = 0, 3, 2
for i in range(2, 1000):
    num, deno = num + deno * 2, num + deno
    if len(str(num)) > len(str(deno)): count += 1
print count
