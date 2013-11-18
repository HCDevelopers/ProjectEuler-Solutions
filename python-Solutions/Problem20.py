#Problem20
def factorial(x):
    '''
    assumes: x > -1
    returns: x!
    '''
    if x==0 or x==1:
        return 1
    else:
        return x*factorial(x-1)

total=0
obj=str(factorial(100))
for i in obj:
    total+=int(i)
print(str(total))
