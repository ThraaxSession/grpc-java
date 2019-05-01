// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/instrumentation/v1alpha/monitoring.proto

package io.grpc.instrumentation.v1alpha;

public interface StatsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grpc.instrumentation.v1alpha.StatsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A StatsResponse can optionally contain the MeasurementDescriptor and
   * ViewDescriptor for the View. These will be sent in the first WatchStats
   * response, or all GetStats and GetCanonicalRpcStats responses. These will
   * not be set for {Get,Watch}Stats if
   * dont_include_descriptors_in_first_response is set to true in the
   * StatsRequest.
   * </pre>
   *
   * <code>.google.instrumentation.MeasurementDescriptor measurement_descriptor = 1;</code>
   */
  boolean hasMeasurementDescriptor();
  /**
   * <pre>
   * A StatsResponse can optionally contain the MeasurementDescriptor and
   * ViewDescriptor for the View. These will be sent in the first WatchStats
   * response, or all GetStats and GetCanonicalRpcStats responses. These will
   * not be set for {Get,Watch}Stats if
   * dont_include_descriptors_in_first_response is set to true in the
   * StatsRequest.
   * </pre>
   *
   * <code>.google.instrumentation.MeasurementDescriptor measurement_descriptor = 1;</code>
   */
  com.google.instrumentation.stats.proto.CensusProto.MeasurementDescriptor getMeasurementDescriptor();
  /**
   * <pre>
   * A StatsResponse can optionally contain the MeasurementDescriptor and
   * ViewDescriptor for the View. These will be sent in the first WatchStats
   * response, or all GetStats and GetCanonicalRpcStats responses. These will
   * not be set for {Get,Watch}Stats if
   * dont_include_descriptors_in_first_response is set to true in the
   * StatsRequest.
   * </pre>
   *
   * <code>.google.instrumentation.MeasurementDescriptor measurement_descriptor = 1;</code>
   */
  com.google.instrumentation.stats.proto.CensusProto.MeasurementDescriptorOrBuilder getMeasurementDescriptorOrBuilder();

  /**
   * <code>.google.instrumentation.ViewDescriptor view_descriptor = 2;</code>
   */
  boolean hasViewDescriptor();
  /**
   * <code>.google.instrumentation.ViewDescriptor view_descriptor = 2;</code>
   */
  com.google.instrumentation.stats.proto.CensusProto.ViewDescriptor getViewDescriptor();
  /**
   * <code>.google.instrumentation.ViewDescriptor view_descriptor = 2;</code>
   */
  com.google.instrumentation.stats.proto.CensusProto.ViewDescriptorOrBuilder getViewDescriptorOrBuilder();

  /**
   * <pre>
   * The View data.
   * </pre>
   *
   * <code>.google.instrumentation.View view = 3;</code>
   */
  boolean hasView();
  /**
   * <pre>
   * The View data.
   * </pre>
   *
   * <code>.google.instrumentation.View view = 3;</code>
   */
  com.google.instrumentation.stats.proto.CensusProto.View getView();
  /**
   * <pre>
   * The View data.
   * </pre>
   *
   * <code>.google.instrumentation.View view = 3;</code>
   */
  com.google.instrumentation.stats.proto.CensusProto.ViewOrBuilder getViewOrBuilder();
}