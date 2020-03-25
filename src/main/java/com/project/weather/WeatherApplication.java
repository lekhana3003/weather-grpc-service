package com.project.weather;

import com.project.weather.resource.weatherServiceImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class WeatherApplication {

	public static void main(String[] args) throws IOException, InterruptedException {
		SpringApplication.run(WeatherApplication.class, args);
		Server server = ServerBuilder.forPort(6565)
				.addService(new weatherServiceImpl()).build();

		System.out.println("Starting server...");
		server.start();
		System.out.println("Server started!");
		server.awaitTermination();

	}

}
