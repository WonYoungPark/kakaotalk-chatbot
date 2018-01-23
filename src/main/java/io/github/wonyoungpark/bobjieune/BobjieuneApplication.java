package io.github.wonyoungpark.bobjieune;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BobjieuneApplication {

	public static void main(String[] args) {
		System.setProperty("reactor.ipc.netty.workerCount", "1");
		System.setProperty("reactor.ipc.netty.pool.maxConnections", "20");

		SpringApplication.run(BobjieuneApplication.class, args);
	}
}
