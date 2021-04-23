package com.testpipeline.demo.to.test.pipeline.with.Jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoToTestPipelineWithJenkinsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoToTestPipelineWithJenkinsApplication.class, args);
	}

	public void displayText() {
		System.out.println("Jenkins from the main class");
	}
}
