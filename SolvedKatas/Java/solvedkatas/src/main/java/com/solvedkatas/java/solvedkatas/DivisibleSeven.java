package com.solvedkatas.java.solvedkatas;

/**
 *
 * @author dgiraldo
 */

class DivisibleSeven {
    public static long[] seven(long m) {

        long[] values = new long[2];
        int run = 1;

        while (Long.toString(m).length() > 2) {
            String mS = Long.toString(m);
            Long left = Long.parseLong(mS.substring(0, mS.length() - 1));
            Long right = Long.parseLong(mS.substring(mS.length() - 1, mS.length()));
            m = left - (2 * right);
            values[0] = m;
            values[1] = run;
            run++;
        }

        return values;
    }
}
