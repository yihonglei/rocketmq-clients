// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rocketmq.proto

package org.apache.rocketmq.proto;

public interface QueryAssignmentRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:rocketmq.rpc.api.QueryAssignmentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string topic = 1;</code>
   */
  java.lang.String getTopic();
  /**
   * <code>string topic = 1;</code>
   */
  com.google.protobuf.ByteString
      getTopicBytes();

  /**
   * <code>string consumer_group = 2;</code>
   */
  java.lang.String getConsumerGroup();
  /**
   * <code>string consumer_group = 2;</code>
   */
  com.google.protobuf.ByteString
      getConsumerGroupBytes();

  /**
   * <code>string client_id = 3;</code>
   */
  java.lang.String getClientId();
  /**
   * <code>string client_id = 3;</code>
   */
  com.google.protobuf.ByteString
      getClientIdBytes();

  /**
   * <code>string strategy_name = 4;</code>
   */
  java.lang.String getStrategyName();
  /**
   * <code>string strategy_name = 4;</code>
   */
  com.google.protobuf.ByteString
      getStrategyNameBytes();

  /**
   * <code>.rocketmq.rpc.api.MessageModel message_model = 5;</code>
   */
  int getMessageModelValue();
  /**
   * <code>.rocketmq.rpc.api.MessageModel message_model = 5;</code>
   */
  org.apache.rocketmq.proto.MessageModel getMessageModel();

  /**
   * <code>string broker_name = 6;</code>
   */
  java.lang.String getBrokerName();
  /**
   * <code>string broker_name = 6;</code>
   */
  com.google.protobuf.ByteString
      getBrokerNameBytes();
}
