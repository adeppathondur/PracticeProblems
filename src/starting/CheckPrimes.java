package com.codeforces.starting;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class CheckPrimes {
    public boolean isPrime(int x) {


        DateFormat f = new SimpleDateFormat("dd mmm yyyy");
        int sqrt = (int) Math.sqrt(x);

        for (int i = 2; i <= sqrt; i++) {
            if (x % i == 0)
                return false;
        }

        return true;
    }

    // find all prime numbers up to 1e8.
    public boolean[] getSieveOfErastosthenes(int limit) {
        boolean[] isComposite = new boolean[limit + 5];
        int ctr = 2;

        while ((ctr << 1) <= limit) {
            isComposite[ctr << 1] = true;
            ctr++;
        }

        for (int i = 3; i <= limit; i += 2) {
            if (isComposite[i])
                continue;

            ctr = i + i;

            while (ctr <= limit) {
                isComposite[ctr] = true;
                ctr += i;
            }
        }

        return isComposite;
    }

    public List<Integer> getPrimes(int limit) {
        boolean[] sieve = getSieveOfErastosthenes(limit);
        List<Integer> primes = new ArrayList<>();

        for (int i = 2; i <= limit; i++) {
            if (sieve[i])
                primes.add(i);
        }

        return primes;
    }



}
