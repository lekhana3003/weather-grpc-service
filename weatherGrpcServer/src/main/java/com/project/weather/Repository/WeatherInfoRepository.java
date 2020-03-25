package com.project.weather.Repository;

import com.project.weather.Document.WeatherInfo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface WeatherInfoRepository extends ReactiveMongoRepository<WeatherInfo,String> {

    @Query("{'cityName':?0}")
    Mono<WeatherInfo> getByCityName(String cityName);

    @Query("{'temperature':?0}")
    Flux<WeatherInfo> getByTemperature(Float temperature);

    @Query("{'pressure':?0}")
    Flux<WeatherInfo> getByPresssure(Float pressure);

}
