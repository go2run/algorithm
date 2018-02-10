package com.arelikebrothers.learn.algorithm.base;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@RunWith(SpringRunner.class)
@SpringBootTest
@EnableAspectJAutoProxy
public class BubbleTest {
    List<Integer> integers = null;
    Bubble bubble = null;

    @Before
    public void init() {
        Random random = new Random();
        IntStream intStream = random.ints(0, 1000);

        integers = intStream.limit(10).boxed().collect(Collectors.toList());

        bubble = new Bubble();
    }

    @Test
    public void sort() {

        integers.forEach(System.out::println);

        bubble.sort(integers);
        System.out.println("After");

        integers.forEach(System.out::println);
    }

}