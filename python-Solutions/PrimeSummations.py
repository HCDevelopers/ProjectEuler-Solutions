import time
start = time.time()

def sieve(num):    
    primes = range(2,num+1)    
    for i in primes:        
        j = 2        
    while i * j <= primes[-1]:            
            if i * j in primes:
        primes.remove(i*j)
        j += 1
    return primes

primes=sieve(1000)
targetVal=2
while True:
    numOfWays = [1]+[0]*targetVal
    for i in primes:
        for j in range(i, targetVal+1):
            numOfWays[j] += numOfWays[j-i]
    if numOfWays[targetVal] > 5000:
        break
    targetVal += 1;

print targetVal
print "Run Time = " + str(time.time() - start)
