package com.nttdata.actividad1;

import reactor.core.publisher.Flux;

public class exercise1 {

	public static void main(String[] args) {
		Flux<String> messageSender = Flux.just("Mensaje 1", "Mensaje 2", "Mensaje 3");
		
		//messageSender.subscribe(message -> System.out.println("observer 1. Received: " + message));
		//messageSender.subscribe(message -> System.out.println("observer 1. Received: " + message));
		
		messageSender.doOnNext((element) -> {
			System.out.println(element);
		}).blockLast();
	}

}
