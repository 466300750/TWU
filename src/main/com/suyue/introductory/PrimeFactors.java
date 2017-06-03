package com.suyue.introductory;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public List<Integer> generate(int n) {

        List<Integer> list = new ArrayList<Integer>();

        for (int i = 2; i*i<=n; i++) {
            if (n == 1) break;
            while (n % i == 0) {
                list.add(i);
                n /= i;
            }
        }
        if (n > 1) list.add(n);

        return list;
    }
}
