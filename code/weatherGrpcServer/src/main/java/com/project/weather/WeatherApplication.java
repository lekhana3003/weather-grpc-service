package com.project.weather;

import com.project.weather.Document.WeatherInfo;
import com.project.weather.Repository.WeatherInfoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@EnableEurekaClient
@SpringBootApplication
public class WeatherApplication {
	@Bean
	CommandLineRunner WeatherInfo(WeatherInfoRepository weatherinfoRespository){

		return args -> {
			weatherinfoRespository
					.deleteAll().subscribe();



                                Stream.of(
                                    new WeatherInfo("Bangalore","Bangalore",21f,33f),
                                    new WeatherInfo("Hyderabad","Hyderabad",33f,43f),
                                    new WeatherInfo("Delhi","Delhi",11f,43f),
                                    new WeatherInfo("Chennai","Chennai",21f,211f),
                                    new WeatherInfo("Varnasi","Varnasi",31f,33f)

                                ).forEach(weatherInfo->{
                                    weatherinfoRespository
                                            .save(weatherInfo)
											.subscribe();

                                });





		};
	}


	public static void main(String[] args) {
		SpringApplication.run(WeatherApplication.class, args);
	}

}