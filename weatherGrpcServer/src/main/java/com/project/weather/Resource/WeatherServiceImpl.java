package com.project.weather.Resource;

import com.project.weather.Document.WeatherInfo;
import com.project.weather.Repository.WeatherInfoRepository;
import com.project.weather.grpc.*;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.reactivestreams.Processor;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import org.springframework.beans.factory.annotation.Autowired;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Operators;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import java.util.function.Consumer;

@GRpcService
public class WeatherServiceImpl extends WeatherServiceGrpc.WeatherServiceImplBase {
    @Autowired
    WeatherInfoRepository weatherInfoRepository;

    @Override
    public void sendCity(City request, StreamObserver<WeatherData> responseObserver) {
        String city = request.getCityName();


 Mono<WeatherInfo> weatherInfoMono = weatherInfoRepository.getByCityName(city);
    weatherInfoMono.subscribe(new Consumer<WeatherInfo>() {
        @Override
        public void accept(WeatherInfo weatherInfo) {
            Temperature t = Temperature.newBuilder().setTempValue(weatherInfo.getTemperature()).build();
            Pressure p= Pressure.newBuilder().setPressValue(weatherInfo.getPressure()).build();
            WeatherData wd=WeatherData.newBuilder().setTemp(t).setPress(p).build();
            responseObserver.onNext(wd);
            responseObserver.onCompleted();
        }
    });


    }

    @Override
    public void sendTemperature(Temperature request, StreamObserver<City> responseObserver) {


        Float temperature=request.getTempValue();
        Flux<WeatherInfo> resultFlux=weatherInfoRepository.getByTemperature(temperature);
        resultFlux.doOnNext(new Consumer<WeatherInfo>() {
            @Override
            public void accept(WeatherInfo weatherInfo) {
                responseObserver.onNext(City.newBuilder().setCityName(weatherInfo.getCityName()).build());

            }
        })
        .doOnComplete(new Runnable() {
            @Override
            public void run() {
                responseObserver.onCompleted();
            }
        }).subscribe();

    }

    @Override
    public void sendPressure(Pressure request, StreamObserver<City> responseObserver) {
        Float pressure=request.getPressValue();
        Flux<WeatherInfo> resultFlux=weatherInfoRepository.getByPresssure(pressure);
        resultFlux.doOnNext(new Consumer<WeatherInfo>() {
            @Override
            public void accept(WeatherInfo weatherInfo) {
                responseObserver.onNext(City.newBuilder().setCityName(weatherInfo.getCityName()).build());

            }
        }).doOnComplete(new Runnable() {
            @Override
            public void run() {
                responseObserver.onCompleted();
            }
        }).subscribe();


    }
}

