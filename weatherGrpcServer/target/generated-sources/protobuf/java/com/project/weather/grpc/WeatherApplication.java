// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WeatherApplication.proto

package com.project.weather.grpc;

public final class WeatherApplication {
  private WeatherApplication() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_project_weather_grpc_City_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_project_weather_grpc_City_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_project_weather_grpc_Temperature_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_project_weather_grpc_Temperature_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_project_weather_grpc_Pressure_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_project_weather_grpc_Pressure_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_project_weather_grpc_WeatherData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_project_weather_grpc_WeatherData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030WeatherApplication.proto\022\030com.project." +
      "weather.grpc\"\030\n\004City\022\020\n\010cityName\030\001 \001(\t\" " +
      "\n\013Temperature\022\021\n\ttempValue\030\001 \001(\002\"\036\n\010Pres" +
      "sure\022\022\n\npressValue\030\001 \001(\002\"u\n\013WeatherData\022" +
      "3\n\004temp\030\001 \001(\0132%.com.project.weather.grpc" +
      ".Temperature\0221\n\005press\030\002 \001(\0132\".com.projec" +
      "t.weather.grpc.Pressure2\225\002\n\016WeatherServi" +
      "ce\022Q\n\010SendCity\022\036.com.project.weather.grp" +
      "c.City\032%.com.project.weather.grpc.Weathe" +
      "rData\022Z\n\017SendTemperature\022%.com.project.w",
      "eather.grpc.Temperature\032\036.com.project.we" +
      "ather.grpc.City0\001\022T\n\014SendPressure\022\".com." +
      "project.weather.grpc.Pressure\032\036.com.proj" +
      "ect.weather.grpc.City0\001B\005P\001\210\001\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_com_project_weather_grpc_City_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_project_weather_grpc_City_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_project_weather_grpc_City_descriptor,
        new java.lang.String[] { "CityName", });
    internal_static_com_project_weather_grpc_Temperature_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_project_weather_grpc_Temperature_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_project_weather_grpc_Temperature_descriptor,
        new java.lang.String[] { "TempValue", });
    internal_static_com_project_weather_grpc_Pressure_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_project_weather_grpc_Pressure_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_project_weather_grpc_Pressure_descriptor,
        new java.lang.String[] { "PressValue", });
    internal_static_com_project_weather_grpc_WeatherData_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_project_weather_grpc_WeatherData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_project_weather_grpc_WeatherData_descriptor,
        new java.lang.String[] { "Temp", "Press", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
