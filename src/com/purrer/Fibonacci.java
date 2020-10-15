package com.purrer;

import java.util.HashMap;

public class Fibonacci {
    private HashMap<Long, Long> cache;
    private long[] array;
    {
        cache = new HashMap<>();
        array = new long[]{1,1};
    }

    //recursive non-effective method
    public long recursive(long i){
        if(i < 2)
            return i;
        return recursive(i - 1) + recursive(i - 2 );
    }

    //recursive method with memorizing
    public long recursiveMemorize(long i){
        if(i < 2)
            return i;
        if(cache.containsKey(i))
            return cache.get(i);
        long res = recursiveMemorize(i - 1) + recursiveMemorize(i - 2);
        cache.put(i, res);
        return res;
    }

    public long arrayMethod(long i){
        if(i < 2)
            return i;
        long res = 0;
        for(int j = 2; j < i; j++){
            res = array[0] + array[1];
            array[0] = array[1];
            array[1] = res;
        }
        return res;

    }


}
