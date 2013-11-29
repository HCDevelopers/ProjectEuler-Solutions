cubes = {}
for i in xrange(10000) :
    j = i**3
    num = "".join(sorted(str(j)))
    if cubes.has_key(num) :
        cubes[num].append(j)
        if len(cubes[num]) == 5 :
            print min(cubes[num])
            break            
    else :
        cubes[num] = [j]
