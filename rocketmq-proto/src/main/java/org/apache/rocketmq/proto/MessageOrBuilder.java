// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rocketmq.proto

package org.apache.rocketmq.proto;

public interface MessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:rocketmq.rpc.api.Message)
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
   * <code>int32 flag = 2;</code>
   */
  int getFlag();

  /**
   * <code>map&lt;string, string&gt; properties = 3;</code>
   */
  int getPropertiesCount();
  /**
   * <code>map&lt;string, string&gt; properties = 3;</code>
   */
  boolean containsProperties(
      java.lang.String key);
  /**
   * Use {@link #getPropertiesMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getProperties();
  /**
   * <code>map&lt;string, string&gt; properties = 3;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getPropertiesMap();
  /**
   * <code>map&lt;string, string&gt; properties = 3;</code>
   */

  java.lang.String getPropertiesOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <code>map&lt;string, string&gt; properties = 3;</code>
   */

  java.lang.String getPropertiesOrThrow(
      java.lang.String key);

  /**
   * <code>bytes body = 4;</code>
   */
  com.google.protobuf.ByteString getBody();
}
