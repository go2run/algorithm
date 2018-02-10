package com.arelikebrothers.learn.algorithm.aop.annotation;

import java.lang.annotation.*;

@Documented
@Target({ElementType.PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface TimeCostLog {
}
