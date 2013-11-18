primesToQ m = 2 : sieve [3,5..m]  where
    sieve []     = []
    sieve (p:xs) = p : sieve (xs `minus` [p*p, p*p+2*p..m])

minus (x:xs) (y:ys) = case (compare x y) of 
           LT -> x : minus  xs  (y:ys)
           EQ ->     minus  xs     ys 
           GT ->     minus (x:xs)  ys
minus  xs     _     = xs

{-|

Now to get the 10001th prime I loaded the sieve code into ghci:

Code: SELECT ALL
ghci primes.hs

And there I typed:

Code: SELECT ALL
primesToQ 105000 !! 10000

This calculates the primes up to the limit 105000 and the !! function takes the 10000th number from that list. Because the list starts with 0, it is the 10000th and not the 10001th number.

Result: 104743

}
