package com.example.demo.service;

import java.util.function.Supplier;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

@Service
public class MathService {
	
	public Stream<Long> factorialStream() {
		return Stream.generate(new Supplier<Long>() {
			private long f = 1;
			private long n = 0;
			private long sum= 1;
			@Override
			public Long get() {
//				f=f+n;
//				sum=f;
//				f=n;
//				n=sum;
				sum=f+n;
				f=n;
				n=sum;
				return sum;
			}});
		}
	
}