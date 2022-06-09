package org.example.qajavamvnPackagesAndCycles.sqr;

public class SQRService {
    public int calcSqrt(int min, int max) {
        int sqr = 0;
        for (int i = 10; i <= 99; i++) {

            int x = i * i;
            if (x >= min && x <= max) {
                sqr = sqr + 1;


            }

        }
        return sqr;
    }
}