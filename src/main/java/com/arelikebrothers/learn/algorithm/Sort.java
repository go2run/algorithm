package com.arelikebrothers.learn.algorithm;


import com.arelikebrothers.learn.algorithm.aop.annotation.TimeCostLog;

import java.util.List;


public interface Sort {
    void sort(List<? extends Comparable> list);
}
