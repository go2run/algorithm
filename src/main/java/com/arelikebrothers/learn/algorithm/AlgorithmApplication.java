package com.arelikebrothers.learn.algorithm;

import com.arelikebrothers.learn.algorithm.aop.annotation.TimeCostLog;
import com.arelikebrothers.learn.algorithm.base.Bubble;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@SpringBootApplication
@EnableAspectJAutoProxy
public class AlgorithmApplication {

	public static void main(String[] args)
	{
        SpringApplication.run(AlgorithmApplication.class, args);

		List<Integer> integers = null;
		Bubble bubble = null;

		Random random = new Random();
		IntStream intStream = random.ints(0, 1000);

		integers = intStream.limit(10).boxed().collect(Collectors.toList());

		bubble = new Bubble();

		integers.forEach(System.out::println);

		bubble.sort(integers);
		System.out.println("After");

		integers.forEach(System.out::println);

	}
}
