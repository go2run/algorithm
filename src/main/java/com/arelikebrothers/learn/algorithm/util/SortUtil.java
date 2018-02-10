package com.arelikebrothers.learn.algorithm.util;

import com.arelikebrothers.learn.algorithm.aop.annotation.TimeCostLog;

public class SortUtil {
    @TimeCostLog
    public static boolean needSwap(Comparable previous, Comparable next) {
        int cmp = previous.compareTo(next);

        if (cmp > 0 ) {
            return true;
        }

        return false;
    }

}
