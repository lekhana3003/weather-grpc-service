package com.project.weather.repository;

import com.project.weather.model.WeatherInfo;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

public interface WeatherinfoRespository extends ReactiveMongoRepository<WeatherInfo,String> {

}
