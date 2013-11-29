import time
start = time.time()
numOfWays = [1]+[0]*100
for i in range(1,100):
  for j in range(i, 101):
    numOfWays[j] += numOfWays[j-i]
print numOfWays[100]
print "Run Time = " + str(time.time() - start)
