package com.project.weather.grpc;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.4.0)",
    comments = "Source: WeatherApplication.proto")
public final class WeatherServiceGrpc {

  private WeatherServiceGrpc() {}

  public static final String SERVICE_NAME = "com.project.weather.grpc.WeatherService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.project.weather.grpc.City,
      com.project.weather.grpc.WeatherData> METHOD_SEND_CITY =
      io.grpc.MethodDescriptor.<com.project.weather.grpc.City, com.project.weather.grpc.WeatherData>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.project.weather.grpc.WeatherService", "SendCity"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.project.weather.grpc.City.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.project.weather.grpc.WeatherData.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.project.weather.grpc.Temperature,
      com.project.weather.grpc.City> METHOD_SEND_TEMPERATURE =
      io.grpc.MethodDescriptor.<com.project.weather.grpc.Temperature, com.project.weather.grpc.City>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "com.project.weather.grpc.WeatherService", "SendTemperature"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.project.weather.grpc.Temperature.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.project.weather.grpc.City.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.project.weather.grpc.Pressure,
      com.project.weather.grpc.City> METHOD_SEND_PRESSURE =
      io.grpc.MethodDescriptor.<com.project.weather.grpc.Pressure, com.project.weather.grpc.City>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "com.project.weather.grpc.WeatherService", "SendPressure"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.project.weather.grpc.Pressure.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.project.weather.grpc.City.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WeatherServiceStub newStub(io.grpc.Channel channel) {
    return new WeatherServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WeatherServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new WeatherServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WeatherServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new WeatherServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class WeatherServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void sendCity(com.project.weather.grpc.City request,
        io.grpc.stub.StreamObserver<com.project.weather.grpc.WeatherData> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SEND_CITY, responseObserver);
    }

    /**
     */
    public void sendTemperature(com.project.weather.grpc.Temperature request,
        io.grpc.stub.StreamObserver<com.project.weather.grpc.City> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SEND_TEMPERATURE, responseObserver);
    }

    /**
     */
    public void sendPressure(com.project.weather.grpc.Pressure request,
        io.grpc.stub.StreamObserver<com.project.weather.grpc.City> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SEND_PRESSURE, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_SEND_CITY,
            asyncUnaryCall(
              new MethodHandlers<
                com.project.weather.grpc.City,
                com.project.weather.grpc.WeatherData>(
                  this, METHODID_SEND_CITY)))
          .addMethod(
            METHOD_SEND_TEMPERATURE,
            asyncServerStreamingCall(
              new MethodHandlers<
                com.project.weather.grpc.Temperature,
                com.project.weather.grpc.City>(
                  this, METHODID_SEND_TEMPERATURE)))
          .addMethod(
            METHOD_SEND_PRESSURE,
            asyncServerStreamingCall(
              new MethodHandlers<
                com.project.weather.grpc.Pressure,
                com.project.weather.grpc.City>(
                  this, METHODID_SEND_PRESSURE)))
          .build();
    }
  }

  /**
   */
  public static final class WeatherServiceStub extends io.grpc.stub.AbstractStub<WeatherServiceStub> {
    private WeatherServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WeatherServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WeatherServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WeatherServiceStub(channel, callOptions);
    }

    /**
     */
    public void sendCity(com.project.weather.grpc.City request,
        io.grpc.stub.StreamObserver<com.project.weather.grpc.WeatherData> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SEND_CITY, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sendTemperature(com.project.weather.grpc.Temperature request,
        io.grpc.stub.StreamObserver<com.project.weather.grpc.City> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_SEND_TEMPERATURE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sendPressure(com.project.weather.grpc.Pressure request,
        io.grpc.stub.StreamObserver<com.project.weather.grpc.City> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_SEND_PRESSURE, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class WeatherServiceBlockingStub extends io.grpc.stub.AbstractStub<WeatherServiceBlockingStub> {
    private WeatherServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WeatherServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WeatherServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WeatherServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.project.weather.grpc.WeatherData sendCity(com.project.weather.grpc.City request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SEND_CITY, getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.project.weather.grpc.City> sendTemperature(
        com.project.weather.grpc.Temperature request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_SEND_TEMPERATURE, getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.project.weather.grpc.City> sendPressure(
        com.project.weather.grpc.Pressure request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_SEND_PRESSURE, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class WeatherServiceFutureStub extends io.grpc.stub.AbstractStub<WeatherServiceFutureStub> {
    private WeatherServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WeatherServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WeatherServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WeatherServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.project.weather.grpc.WeatherData> sendCity(
        com.project.weather.grpc.City request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SEND_CITY, getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND_CITY = 0;
  private static final int METHODID_SEND_TEMPERATURE = 1;
  private static final int METHODID_SEND_PRESSURE = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final WeatherServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(WeatherServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND_CITY:
          serviceImpl.sendCity((com.project.weather.grpc.City) request,
              (io.grpc.stub.StreamObserver<com.project.weather.grpc.WeatherData>) responseObserver);
          break;
        case METHODID_SEND_TEMPERATURE:
          serviceImpl.sendTemperature((com.project.weather.grpc.Temperature) request,
              (io.grpc.stub.StreamObserver<com.project.weather.grpc.City>) responseObserver);
          break;
        case METHODID_SEND_PRESSURE:
          serviceImpl.sendPressure((com.project.weather.grpc.Pressure) request,
              (io.grpc.stub.StreamObserver<com.project.weather.grpc.City>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static final class WeatherServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.project.weather.grpc.WeatherApplication.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (WeatherServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WeatherServiceDescriptorSupplier())
              .addMethod(METHOD_SEND_CITY)
              .addMethod(METHOD_SEND_TEMPERATURE)
              .addMethod(METHOD_SEND_PRESSURE)
              .build();
        }
      }
    }
    return result;
  }
}
