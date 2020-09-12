package com.unifacef.contapalavras;

import org.apache.kafka.streams.kstream.KStream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ContaPalavrasApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContaPalavrasApplication.class, args);
	}

	@Bean
	public java.util.function.Consumer<KStream<String, String>> process() {

		return input -> input.foreach((key, value) -> {
			System.out.println("Key: " + key + " Value: " + value);
		});
	}

}
