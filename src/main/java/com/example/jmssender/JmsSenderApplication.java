package com.example.jmssender;

import com.example.jmssender.jms.Product;
import com.example.jmssender.jms.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JmsSenderApplication implements ApplicationRunner {
	@Autowired
	private Sender sender;

	public static void main(String[] args) {
		SpringApplication.run(JmsSenderApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Product product = new Product();
		product.setProductId(1);
		product.setName("oil");
		product.setQuantity(5);
		//sender.send("sending hii guys");
		sender.send(product);
	}

}