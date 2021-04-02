// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rocketmq.proto

package org.apache.rocketmq.proto;

/**
 * Protobuf type {@code rocketmq.rpc.api.UpdateConsumerOffsetRequest}
 */
public  final class UpdateConsumerOffsetRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:rocketmq.rpc.api.UpdateConsumerOffsetRequest)
    UpdateConsumerOffsetRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateConsumerOffsetRequest.newBuilder() to construct.
  private UpdateConsumerOffsetRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateConsumerOffsetRequest() {
    brokerName_ = "";
    topic_ = "";
    consumerGroup_ = "";
    queueId_ = 0;
    commitOffset_ = 0L;
    clientId_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UpdateConsumerOffsetRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            brokerName_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            topic_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            consumerGroup_ = s;
            break;
          }
          case 32: {

            queueId_ = input.readInt32();
            break;
          }
          case 40: {

            commitOffset_ = input.readInt64();
            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();

            clientId_ = s;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.apache.rocketmq.proto.ACS.internal_static_rocketmq_rpc_api_UpdateConsumerOffsetRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.apache.rocketmq.proto.ACS.internal_static_rocketmq_rpc_api_UpdateConsumerOffsetRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.apache.rocketmq.proto.UpdateConsumerOffsetRequest.class, org.apache.rocketmq.proto.UpdateConsumerOffsetRequest.Builder.class);
  }

  public static final int BROKER_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object brokerName_;
  /**
   * <code>string broker_name = 1;</code>
   */
  public java.lang.String getBrokerName() {
    java.lang.Object ref = brokerName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      brokerName_ = s;
      return s;
    }
  }
  /**
   * <code>string broker_name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getBrokerNameBytes() {
    java.lang.Object ref = brokerName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      brokerName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TOPIC_FIELD_NUMBER = 2;
  private volatile java.lang.Object topic_;
  /**
   * <code>string topic = 2;</code>
   */
  public java.lang.String getTopic() {
    java.lang.Object ref = topic_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      topic_ = s;
      return s;
    }
  }
  /**
   * <code>string topic = 2;</code>
   */
  public com.google.protobuf.ByteString
      getTopicBytes() {
    java.lang.Object ref = topic_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      topic_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CONSUMER_GROUP_FIELD_NUMBER = 3;
  private volatile java.lang.Object consumerGroup_;
  /**
   * <code>string consumer_group = 3;</code>
   */
  public java.lang.String getConsumerGroup() {
    java.lang.Object ref = consumerGroup_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      consumerGroup_ = s;
      return s;
    }
  }
  /**
   * <code>string consumer_group = 3;</code>
   */
  public com.google.protobuf.ByteString
      getConsumerGroupBytes() {
    java.lang.Object ref = consumerGroup_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      consumerGroup_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int QUEUE_ID_FIELD_NUMBER = 4;
  private int queueId_;
  /**
   * <code>int32 queue_id = 4;</code>
   */
  public int getQueueId() {
    return queueId_;
  }

  public static final int COMMIT_OFFSET_FIELD_NUMBER = 5;
  private long commitOffset_;
  /**
   * <code>int64 commit_offset = 5;</code>
   */
  public long getCommitOffset() {
    return commitOffset_;
  }

  public static final int CLIENT_ID_FIELD_NUMBER = 6;
  private volatile java.lang.Object clientId_;
  /**
   * <pre>
   * For case of broadcasting
   * </pre>
   *
   * <code>string client_id = 6;</code>
   */
  public java.lang.String getClientId() {
    java.lang.Object ref = clientId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      clientId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * For case of broadcasting
   * </pre>
   *
   * <code>string client_id = 6;</code>
   */
  public com.google.protobuf.ByteString
      getClientIdBytes() {
    java.lang.Object ref = clientId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      clientId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getBrokerNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, brokerName_);
    }
    if (!getTopicBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, topic_);
    }
    if (!getConsumerGroupBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, consumerGroup_);
    }
    if (queueId_ != 0) {
      output.writeInt32(4, queueId_);
    }
    if (commitOffset_ != 0L) {
      output.writeInt64(5, commitOffset_);
    }
    if (!getClientIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, clientId_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getBrokerNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, brokerName_);
    }
    if (!getTopicBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, topic_);
    }
    if (!getConsumerGroupBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, consumerGroup_);
    }
    if (queueId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, queueId_);
    }
    if (commitOffset_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, commitOffset_);
    }
    if (!getClientIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, clientId_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.apache.rocketmq.proto.UpdateConsumerOffsetRequest)) {
      return super.equals(obj);
    }
    org.apache.rocketmq.proto.UpdateConsumerOffsetRequest other = (org.apache.rocketmq.proto.UpdateConsumerOffsetRequest) obj;

    boolean result = true;
    result = result && getBrokerName()
        .equals(other.getBrokerName());
    result = result && getTopic()
        .equals(other.getTopic());
    result = result && getConsumerGroup()
        .equals(other.getConsumerGroup());
    result = result && (getQueueId()
        == other.getQueueId());
    result = result && (getCommitOffset()
        == other.getCommitOffset());
    result = result && getClientId()
        .equals(other.getClientId());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + BROKER_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getBrokerName().hashCode();
    hash = (37 * hash) + TOPIC_FIELD_NUMBER;
    hash = (53 * hash) + getTopic().hashCode();
    hash = (37 * hash) + CONSUMER_GROUP_FIELD_NUMBER;
    hash = (53 * hash) + getConsumerGroup().hashCode();
    hash = (37 * hash) + QUEUE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getQueueId();
    hash = (37 * hash) + COMMIT_OFFSET_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCommitOffset());
    hash = (37 * hash) + CLIENT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getClientId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.apache.rocketmq.proto.UpdateConsumerOffsetRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.rocketmq.proto.UpdateConsumerOffsetRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.rocketmq.proto.UpdateConsumerOffsetRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.rocketmq.proto.UpdateConsumerOffsetRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.rocketmq.proto.UpdateConsumerOffsetRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.rocketmq.proto.UpdateConsumerOffsetRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.rocketmq.proto.UpdateConsumerOffsetRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.rocketmq.proto.UpdateConsumerOffsetRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.rocketmq.proto.UpdateConsumerOffsetRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.apache.rocketmq.proto.UpdateConsumerOffsetRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.rocketmq.proto.UpdateConsumerOffsetRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.rocketmq.proto.UpdateConsumerOffsetRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.apache.rocketmq.proto.UpdateConsumerOffsetRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code rocketmq.rpc.api.UpdateConsumerOffsetRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:rocketmq.rpc.api.UpdateConsumerOffsetRequest)
      org.apache.rocketmq.proto.UpdateConsumerOffsetRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.rocketmq.proto.ACS.internal_static_rocketmq_rpc_api_UpdateConsumerOffsetRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.rocketmq.proto.ACS.internal_static_rocketmq_rpc_api_UpdateConsumerOffsetRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.rocketmq.proto.UpdateConsumerOffsetRequest.class, org.apache.rocketmq.proto.UpdateConsumerOffsetRequest.Builder.class);
    }

    // Construct using org.apache.rocketmq.proto.UpdateConsumerOffsetRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      brokerName_ = "";

      topic_ = "";

      consumerGroup_ = "";

      queueId_ = 0;

      commitOffset_ = 0L;

      clientId_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.apache.rocketmq.proto.ACS.internal_static_rocketmq_rpc_api_UpdateConsumerOffsetRequest_descriptor;
    }

    public org.apache.rocketmq.proto.UpdateConsumerOffsetRequest getDefaultInstanceForType() {
      return org.apache.rocketmq.proto.UpdateConsumerOffsetRequest.getDefaultInstance();
    }

    public org.apache.rocketmq.proto.UpdateConsumerOffsetRequest build() {
      org.apache.rocketmq.proto.UpdateConsumerOffsetRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.apache.rocketmq.proto.UpdateConsumerOffsetRequest buildPartial() {
      org.apache.rocketmq.proto.UpdateConsumerOffsetRequest result = new org.apache.rocketmq.proto.UpdateConsumerOffsetRequest(this);
      result.brokerName_ = brokerName_;
      result.topic_ = topic_;
      result.consumerGroup_ = consumerGroup_;
      result.queueId_ = queueId_;
      result.commitOffset_ = commitOffset_;
      result.clientId_ = clientId_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.apache.rocketmq.proto.UpdateConsumerOffsetRequest) {
        return mergeFrom((org.apache.rocketmq.proto.UpdateConsumerOffsetRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.apache.rocketmq.proto.UpdateConsumerOffsetRequest other) {
      if (other == org.apache.rocketmq.proto.UpdateConsumerOffsetRequest.getDefaultInstance()) return this;
      if (!other.getBrokerName().isEmpty()) {
        brokerName_ = other.brokerName_;
        onChanged();
      }
      if (!other.getTopic().isEmpty()) {
        topic_ = other.topic_;
        onChanged();
      }
      if (!other.getConsumerGroup().isEmpty()) {
        consumerGroup_ = other.consumerGroup_;
        onChanged();
      }
      if (other.getQueueId() != 0) {
        setQueueId(other.getQueueId());
      }
      if (other.getCommitOffset() != 0L) {
        setCommitOffset(other.getCommitOffset());
      }
      if (!other.getClientId().isEmpty()) {
        clientId_ = other.clientId_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.apache.rocketmq.proto.UpdateConsumerOffsetRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.apache.rocketmq.proto.UpdateConsumerOffsetRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object brokerName_ = "";
    /**
     * <code>string broker_name = 1;</code>
     */
    public java.lang.String getBrokerName() {
      java.lang.Object ref = brokerName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        brokerName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string broker_name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getBrokerNameBytes() {
      java.lang.Object ref = brokerName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        brokerName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string broker_name = 1;</code>
     */
    public Builder setBrokerName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      brokerName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string broker_name = 1;</code>
     */
    public Builder clearBrokerName() {
      
      brokerName_ = getDefaultInstance().getBrokerName();
      onChanged();
      return this;
    }
    /**
     * <code>string broker_name = 1;</code>
     */
    public Builder setBrokerNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      brokerName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object topic_ = "";
    /**
     * <code>string topic = 2;</code>
     */
    public java.lang.String getTopic() {
      java.lang.Object ref = topic_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        topic_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string topic = 2;</code>
     */
    public com.google.protobuf.ByteString
        getTopicBytes() {
      java.lang.Object ref = topic_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        topic_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string topic = 2;</code>
     */
    public Builder setTopic(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      topic_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string topic = 2;</code>
     */
    public Builder clearTopic() {
      
      topic_ = getDefaultInstance().getTopic();
      onChanged();
      return this;
    }
    /**
     * <code>string topic = 2;</code>
     */
    public Builder setTopicBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      topic_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object consumerGroup_ = "";
    /**
     * <code>string consumer_group = 3;</code>
     */
    public java.lang.String getConsumerGroup() {
      java.lang.Object ref = consumerGroup_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        consumerGroup_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string consumer_group = 3;</code>
     */
    public com.google.protobuf.ByteString
        getConsumerGroupBytes() {
      java.lang.Object ref = consumerGroup_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        consumerGroup_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string consumer_group = 3;</code>
     */
    public Builder setConsumerGroup(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      consumerGroup_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string consumer_group = 3;</code>
     */
    public Builder clearConsumerGroup() {
      
      consumerGroup_ = getDefaultInstance().getConsumerGroup();
      onChanged();
      return this;
    }
    /**
     * <code>string consumer_group = 3;</code>
     */
    public Builder setConsumerGroupBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      consumerGroup_ = value;
      onChanged();
      return this;
    }

    private int queueId_ ;
    /**
     * <code>int32 queue_id = 4;</code>
     */
    public int getQueueId() {
      return queueId_;
    }
    /**
     * <code>int32 queue_id = 4;</code>
     */
    public Builder setQueueId(int value) {
      
      queueId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 queue_id = 4;</code>
     */
    public Builder clearQueueId() {
      
      queueId_ = 0;
      onChanged();
      return this;
    }

    private long commitOffset_ ;
    /**
     * <code>int64 commit_offset = 5;</code>
     */
    public long getCommitOffset() {
      return commitOffset_;
    }
    /**
     * <code>int64 commit_offset = 5;</code>
     */
    public Builder setCommitOffset(long value) {
      
      commitOffset_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 commit_offset = 5;</code>
     */
    public Builder clearCommitOffset() {
      
      commitOffset_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object clientId_ = "";
    /**
     * <pre>
     * For case of broadcasting
     * </pre>
     *
     * <code>string client_id = 6;</code>
     */
    public java.lang.String getClientId() {
      java.lang.Object ref = clientId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        clientId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * For case of broadcasting
     * </pre>
     *
     * <code>string client_id = 6;</code>
     */
    public com.google.protobuf.ByteString
        getClientIdBytes() {
      java.lang.Object ref = clientId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        clientId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * For case of broadcasting
     * </pre>
     *
     * <code>string client_id = 6;</code>
     */
    public Builder setClientId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      clientId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * For case of broadcasting
     * </pre>
     *
     * <code>string client_id = 6;</code>
     */
    public Builder clearClientId() {
      
      clientId_ = getDefaultInstance().getClientId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * For case of broadcasting
     * </pre>
     *
     * <code>string client_id = 6;</code>
     */
    public Builder setClientIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      clientId_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:rocketmq.rpc.api.UpdateConsumerOffsetRequest)
  }

  // @@protoc_insertion_point(class_scope:rocketmq.rpc.api.UpdateConsumerOffsetRequest)
  private static final org.apache.rocketmq.proto.UpdateConsumerOffsetRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.apache.rocketmq.proto.UpdateConsumerOffsetRequest();
  }

  public static org.apache.rocketmq.proto.UpdateConsumerOffsetRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateConsumerOffsetRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateConsumerOffsetRequest>() {
    public UpdateConsumerOffsetRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UpdateConsumerOffsetRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UpdateConsumerOffsetRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateConsumerOffsetRequest> getParserForType() {
    return PARSER;
  }

  public org.apache.rocketmq.proto.UpdateConsumerOffsetRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

