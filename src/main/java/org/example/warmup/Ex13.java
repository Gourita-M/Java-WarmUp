package org.example.warmup;

public class Ex13 {
  

    public int gcd(int a, int b)
    {
        int r = a % b;

        if(r == 0){
            return b;
        }

        return gcd(b, r);
    }
}
