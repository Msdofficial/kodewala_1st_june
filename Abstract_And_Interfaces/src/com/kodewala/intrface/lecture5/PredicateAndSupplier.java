package com.kodewala.intrface.lecture5;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredicateAndSupplier {
	
	public static void main(String[] args) {
		
		Predicate<Integer> predicate = (x) -> x > 1000; // 1. in-built functional interface.
		// 'predicate' always takes an input --> check condition --> return a boolean output.
		
		System.out.println(predicate.test(1200));  // true
		System.out.println(predicate.test(900));   // false 
		
		
		Supplier<String> supplier = () -> "Masood";  // 2. this is also an in-built functional interface.
		// 'supplier' do not takes input --> generate output
		
		System.out.println(supplier.get());  // Masood 
		// Real world use of 'supplier' can be -->  to generate OTP.
		Supplier<Integer> supplier2 = () -> 100000 + new Random().nextInt(900000);
		System.out.println(supplier2.get()); // output will be some random number. 
		
		// 3. in-built Functional Interface. it will consume , no return type .
		Consumer<String> consumer = (emailTo) -> System.out.println("email has been sent to "+emailTo);
		// takes input --> just consume it 
		consumer.accept("mdmasoodraza111@gmail.com");
		
		//4. function --> in-built Functional interface --> takes input --> make calculation --> give output 
		Function<Integer, Integer> funcn = (discPrice) -> discPrice - (discPrice*5/100);
		
		System.out.println(funcn.apply(500));
	}

}
