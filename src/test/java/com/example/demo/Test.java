package com.example.demo;

import java.util.function.Supplier;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

@Service
public class Test {
	
	public Stream<Long> factorialStream() {
		return Stream.generate(new Supplier<Long>() {
			private long f = 1;
			private long n = 1;
			@Override
			public Long get() {
				f *= n;
				n++;
				return f;
			}});
		}
		public Stream<Long> facStream() {
			return Stream.generate(new Supplier<Long>() {
				private long f = 1;
				private long n = 1;
				@Override
				public Long get() {
					f += n;
					n++;
					return f;
				}});
	}
	
}