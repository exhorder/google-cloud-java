// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/securitycenter/v1beta1/securitycenter_service.proto

package com.google.cloud.securitycenter.v1beta1;

public interface UpdateSourceRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycenter.v1beta1.UpdateSourceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The source resource to update.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1beta1.Source source = 1;</code>
   */
  boolean hasSource();
  /**
   *
   *
   * <pre>
   * The source resource to update.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1beta1.Source source = 1;</code>
   */
  com.google.cloud.securitycenter.v1beta1.Source getSource();
  /**
   *
   *
   * <pre>
   * The source resource to update.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1beta1.Source source = 1;</code>
   */
  com.google.cloud.securitycenter.v1beta1.SourceOrBuilder getSourceOrBuilder();

  /**
   *
   *
   * <pre>
   * The FieldMask to use when updating the source resource.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * The FieldMask to use when updating the source resource.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * The FieldMask to use when updating the source resource.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
