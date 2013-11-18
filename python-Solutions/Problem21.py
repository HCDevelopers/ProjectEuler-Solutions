#Problem21
def d(n):
    '''
    assumes: n > -1
    returns: sum of all divisors of n
    '''
    count=1
    for i in range(2,n/2+2):
        if n%i==0:
            count+=i
    return count

total=0
limit=10000
for a in range(1,limit):
    b=d(a)
    if a!=b and d(b)==a:
        total+=a
print(">> ans: "+str(total))
