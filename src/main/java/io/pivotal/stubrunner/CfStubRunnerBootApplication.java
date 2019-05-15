package io.pivotal.stubrunner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.contract.stubrunner.server.EnableStubRunnerServer;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;

@SpringBootApplication
@EnableStubRunnerServer
@EnableDiscoveryClient
public class CfStubRunnerBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(CfStubRunnerBootApplication.class, args);
	}

	@AutoConfigureStubRunner
	static class Config{}


}

