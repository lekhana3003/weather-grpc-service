// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WeatherApplication.proto

package com.project.weather.grpc;

public interface WeatherDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.project.weather.grpc.WeatherData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.com.project.weather.grpc.Temperature temp = 1;</code>
   */
  boolean hasTemp();
  /**
   * <code>.com.project.weather.grpc.Temperature temp = 1;</code>
   */
  com.project.weather.grpc.Temperature getTemp();
  /**
   * <code>.com.project.weather.grpc.Temperature temp = 1;</code>
   */
  com.project.weather.grpc.TemperatureOrBuilder getTempOrBuilder();

  /**
   * <code>.com.project.weather.grpc.Pressure press = 2;</code>
   */
  boolean hasPress();
  /**
   * <code>.com.project.weather.grpc.Pressure press = 2;</code>
   */
  com.project.weather.grpc.Pressure getPress();
  /**
   * <code>.com.project.weather.grpc.Pressure press = 2;</code>
   */
  com.project.weather.grpc.PressureOrBuilder getPressOrBuilder();
}