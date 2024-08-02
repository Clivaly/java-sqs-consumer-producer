package com.crsc.sqs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.crsc.sqs.consumer.MyMessage;

import io.awspring.cloud.sqs.operations.SqsTemplate;

@SpringBootApplication
public class SqsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SqsApplication.class, args);
	}

	@Autowired
	private SqsTemplate sqsTemplate;

	@Override
	public void run(String... args) throws Exception {
		var SQS = "https://localhost.localstack.cloud:4566/000000000000/my-queue";
		sqsTemplate.send(SQS, new MyMessage("my first start value"));
	}

}
