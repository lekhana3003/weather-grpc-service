package com.project.weatherClient;

//import com.netflix.appinfo.InstanceInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.stereotype.Service;

import javax.net.ssl.SSLException;
import java.util.concurrent.ExecutionException;


@EnableEurekaClient
@SpringBootApplication
@Service
public class WeatherClientApplication {
	@Autowired
	GrpcClient gc;




	public static void main(String[] args) throws ExecutionException, InterruptedException, SSLException {



		SpringApplication.run(WeatherClientApplication.class, args);

	}





}
