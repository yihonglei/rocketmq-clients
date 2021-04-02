// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rocketmq.proto

package org.apache.rocketmq.proto;

/**
 * Protobuf type {@code rocketmq.rpc.api.QueryAssignmentResponse}
 */
public  final class QueryAssignmentResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:rocketmq.rpc.api.QueryAssignmentResponse)
    QueryAssignmentResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryAssignmentResponse.newBuilder() to construct.
  private QueryAssignmentResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryAssignmentResponse() {
    code_ = 0;
    remark_ = "";
    messageQueueAssignments_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private QueryAssignmentResponse(
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
          case 8: {
            int rawValue = input.readEnum();

            code_ = rawValue;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            remark_ = s;
            break;
          }
          case 26: {
            if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
              messageQueueAssignments_ = new java.util.ArrayList<org.apache.rocketmq.proto.MessageQueueAssignment>();
              mutable_bitField0_ |= 0x00000004;
            }
            messageQueueAssignments_.add(
                input.readMessage(org.apache.rocketmq.proto.MessageQueueAssignment.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
        messageQueueAssignments_ = java.util.Collections.unmodifiableList(messageQueueAssignments_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.apache.rocketmq.proto.ACS.internal_static_rocketmq_rpc_api_QueryAssignmentResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.apache.rocketmq.proto.ACS.internal_static_rocketmq_rpc_api_QueryAssignmentResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.apache.rocketmq.proto.QueryAssignmentResponse.class, org.apache.rocketmq.proto.QueryAssignmentResponse.Builder.class);
  }

  private int bitField0_;
  public static final int CODE_FIELD_NUMBER = 1;
  private int code_;
  /**
   * <code>.rocketmq.rpc.api.ResponseCode code = 1;</code>
   */
  public int getCodeValue() {
    return code_;
  }
  /**
   * <code>.rocketmq.rpc.api.ResponseCode code = 1;</code>
   */
  public org.apache.rocketmq.proto.ResponseCode getCode() {
    org.apache.rocketmq.proto.ResponseCode result = org.apache.rocketmq.proto.ResponseCode.valueOf(code_);
    return result == null ? org.apache.rocketmq.proto.ResponseCode.UNRECOGNIZED : result;
  }

  public static final int REMARK_FIELD_NUMBER = 2;
  private volatile java.lang.Object remark_;
  /**
   * <code>string remark = 2;</code>
   */
  public java.lang.String getRemark() {
    java.lang.Object ref = remark_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      remark_ = s;
      return s;
    }
  }
  /**
   * <code>string remark = 2;</code>
   */
  public com.google.protobuf.ByteString
      getRemarkBytes() {
    java.lang.Object ref = remark_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      remark_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MESSAGE_QUEUE_ASSIGNMENTS_FIELD_NUMBER = 3;
  private java.util.List<org.apache.rocketmq.proto.MessageQueueAssignment> messageQueueAssignments_;
  /**
   * <code>repeated .rocketmq.rpc.api.MessageQueueAssignment message_queue_assignments = 3;</code>
   */
  public java.util.List<org.apache.rocketmq.proto.MessageQueueAssignment> getMessageQueueAssignmentsList() {
    return messageQueueAssignments_;
  }
  /**
   * <code>repeated .rocketmq.rpc.api.MessageQueueAssignment message_queue_assignments = 3;</code>
   */
  public java.util.List<? extends org.apache.rocketmq.proto.MessageQueueAssignmentOrBuilder> 
      getMessageQueueAssignmentsOrBuilderList() {
    return messageQueueAssignments_;
  }
  /**
   * <code>repeated .rocketmq.rpc.api.MessageQueueAssignment message_queue_assignments = 3;</code>
   */
  public int getMessageQueueAssignmentsCount() {
    return messageQueueAssignments_.size();
  }
  /**
   * <code>repeated .rocketmq.rpc.api.MessageQueueAssignment message_queue_assignments = 3;</code>
   */
  public org.apache.rocketmq.proto.MessageQueueAssignment getMessageQueueAssignments(int index) {
    return messageQueueAssignments_.get(index);
  }
  /**
   * <code>repeated .rocketmq.rpc.api.MessageQueueAssignment message_queue_assignments = 3;</code>
   */
  public org.apache.rocketmq.proto.MessageQueueAssignmentOrBuilder getMessageQueueAssignmentsOrBuilder(
      int index) {
    return messageQueueAssignments_.get(index);
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
    if (code_ != org.apache.rocketmq.proto.ResponseCode.SUCCESS.getNumber()) {
      output.writeEnum(1, code_);
    }
    if (!getRemarkBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, remark_);
    }
    for (int i = 0; i < messageQueueAssignments_.size(); i++) {
      output.writeMessage(3, messageQueueAssignments_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (code_ != org.apache.rocketmq.proto.ResponseCode.SUCCESS.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, code_);
    }
    if (!getRemarkBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, remark_);
    }
    for (int i = 0; i < messageQueueAssignments_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, messageQueueAssignments_.get(i));
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
    if (!(obj instanceof org.apache.rocketmq.proto.QueryAssignmentResponse)) {
      return super.equals(obj);
    }
    org.apache.rocketmq.proto.QueryAssignmentResponse other = (org.apache.rocketmq.proto.QueryAssignmentResponse) obj;

    boolean result = true;
    result = result && code_ == other.code_;
    result = result && getRemark()
        .equals(other.getRemark());
    result = result && getMessageQueueAssignmentsList()
        .equals(other.getMessageQueueAssignmentsList());
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
    hash = (37 * hash) + CODE_FIELD_NUMBER;
    hash = (53 * hash) + code_;
    hash = (37 * hash) + REMARK_FIELD_NUMBER;
    hash = (53 * hash) + getRemark().hashCode();
    if (getMessageQueueAssignmentsCount() > 0) {
      hash = (37 * hash) + MESSAGE_QUEUE_ASSIGNMENTS_FIELD_NUMBER;
      hash = (53 * hash) + getMessageQueueAssignmentsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.apache.rocketmq.proto.QueryAssignmentResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.rocketmq.proto.QueryAssignmentResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.rocketmq.proto.QueryAssignmentResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.rocketmq.proto.QueryAssignmentResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.rocketmq.proto.QueryAssignmentResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.rocketmq.proto.QueryAssignmentResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.rocketmq.proto.QueryAssignmentResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.rocketmq.proto.QueryAssignmentResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.rocketmq.proto.QueryAssignmentResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.apache.rocketmq.proto.QueryAssignmentResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.rocketmq.proto.QueryAssignmentResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.rocketmq.proto.QueryAssignmentResponse parseFrom(
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
  public static Builder newBuilder(org.apache.rocketmq.proto.QueryAssignmentResponse prototype) {
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
   * Protobuf type {@code rocketmq.rpc.api.QueryAssignmentResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:rocketmq.rpc.api.QueryAssignmentResponse)
      org.apache.rocketmq.proto.QueryAssignmentResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.rocketmq.proto.ACS.internal_static_rocketmq_rpc_api_QueryAssignmentResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.rocketmq.proto.ACS.internal_static_rocketmq_rpc_api_QueryAssignmentResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.rocketmq.proto.QueryAssignmentResponse.class, org.apache.rocketmq.proto.QueryAssignmentResponse.Builder.class);
    }

    // Construct using org.apache.rocketmq.proto.QueryAssignmentResponse.newBuilder()
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
        getMessageQueueAssignmentsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      code_ = 0;

      remark_ = "";

      if (messageQueueAssignmentsBuilder_ == null) {
        messageQueueAssignments_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
      } else {
        messageQueueAssignmentsBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.apache.rocketmq.proto.ACS.internal_static_rocketmq_rpc_api_QueryAssignmentResponse_descriptor;
    }

    public org.apache.rocketmq.proto.QueryAssignmentResponse getDefaultInstanceForType() {
      return org.apache.rocketmq.proto.QueryAssignmentResponse.getDefaultInstance();
    }

    public org.apache.rocketmq.proto.QueryAssignmentResponse build() {
      org.apache.rocketmq.proto.QueryAssignmentResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.apache.rocketmq.proto.QueryAssignmentResponse buildPartial() {
      org.apache.rocketmq.proto.QueryAssignmentResponse result = new org.apache.rocketmq.proto.QueryAssignmentResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.code_ = code_;
      result.remark_ = remark_;
      if (messageQueueAssignmentsBuilder_ == null) {
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          messageQueueAssignments_ = java.util.Collections.unmodifiableList(messageQueueAssignments_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.messageQueueAssignments_ = messageQueueAssignments_;
      } else {
        result.messageQueueAssignments_ = messageQueueAssignmentsBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof org.apache.rocketmq.proto.QueryAssignmentResponse) {
        return mergeFrom((org.apache.rocketmq.proto.QueryAssignmentResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.apache.rocketmq.proto.QueryAssignmentResponse other) {
      if (other == org.apache.rocketmq.proto.QueryAssignmentResponse.getDefaultInstance()) return this;
      if (other.code_ != 0) {
        setCodeValue(other.getCodeValue());
      }
      if (!other.getRemark().isEmpty()) {
        remark_ = other.remark_;
        onChanged();
      }
      if (messageQueueAssignmentsBuilder_ == null) {
        if (!other.messageQueueAssignments_.isEmpty()) {
          if (messageQueueAssignments_.isEmpty()) {
            messageQueueAssignments_ = other.messageQueueAssignments_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureMessageQueueAssignmentsIsMutable();
            messageQueueAssignments_.addAll(other.messageQueueAssignments_);
          }
          onChanged();
        }
      } else {
        if (!other.messageQueueAssignments_.isEmpty()) {
          if (messageQueueAssignmentsBuilder_.isEmpty()) {
            messageQueueAssignmentsBuilder_.dispose();
            messageQueueAssignmentsBuilder_ = null;
            messageQueueAssignments_ = other.messageQueueAssignments_;
            bitField0_ = (bitField0_ & ~0x00000004);
            messageQueueAssignmentsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getMessageQueueAssignmentsFieldBuilder() : null;
          } else {
            messageQueueAssignmentsBuilder_.addAllMessages(other.messageQueueAssignments_);
          }
        }
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
      org.apache.rocketmq.proto.QueryAssignmentResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.apache.rocketmq.proto.QueryAssignmentResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int code_ = 0;
    /**
     * <code>.rocketmq.rpc.api.ResponseCode code = 1;</code>
     */
    public int getCodeValue() {
      return code_;
    }
    /**
     * <code>.rocketmq.rpc.api.ResponseCode code = 1;</code>
     */
    public Builder setCodeValue(int value) {
      code_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.rocketmq.rpc.api.ResponseCode code = 1;</code>
     */
    public org.apache.rocketmq.proto.ResponseCode getCode() {
      org.apache.rocketmq.proto.ResponseCode result = org.apache.rocketmq.proto.ResponseCode.valueOf(code_);
      return result == null ? org.apache.rocketmq.proto.ResponseCode.UNRECOGNIZED : result;
    }
    /**
     * <code>.rocketmq.rpc.api.ResponseCode code = 1;</code>
     */
    public Builder setCode(org.apache.rocketmq.proto.ResponseCode value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      code_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.rocketmq.rpc.api.ResponseCode code = 1;</code>
     */
    public Builder clearCode() {
      
      code_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object remark_ = "";
    /**
     * <code>string remark = 2;</code>
     */
    public java.lang.String getRemark() {
      java.lang.Object ref = remark_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        remark_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string remark = 2;</code>
     */
    public com.google.protobuf.ByteString
        getRemarkBytes() {
      java.lang.Object ref = remark_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        remark_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string remark = 2;</code>
     */
    public Builder setRemark(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      remark_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string remark = 2;</code>
     */
    public Builder clearRemark() {
      
      remark_ = getDefaultInstance().getRemark();
      onChanged();
      return this;
    }
    /**
     * <code>string remark = 2;</code>
     */
    public Builder setRemarkBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      remark_ = value;
      onChanged();
      return this;
    }

    private java.util.List<org.apache.rocketmq.proto.MessageQueueAssignment> messageQueueAssignments_ =
      java.util.Collections.emptyList();
    private void ensureMessageQueueAssignmentsIsMutable() {
      if (!((bitField0_ & 0x00000004) == 0x00000004)) {
        messageQueueAssignments_ = new java.util.ArrayList<org.apache.rocketmq.proto.MessageQueueAssignment>(messageQueueAssignments_);
        bitField0_ |= 0x00000004;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.apache.rocketmq.proto.MessageQueueAssignment, org.apache.rocketmq.proto.MessageQueueAssignment.Builder, org.apache.rocketmq.proto.MessageQueueAssignmentOrBuilder> messageQueueAssignmentsBuilder_;

    /**
     * <code>repeated .rocketmq.rpc.api.MessageQueueAssignment message_queue_assignments = 3;</code>
     */
    public java.util.List<org.apache.rocketmq.proto.MessageQueueAssignment> getMessageQueueAssignmentsList() {
      if (messageQueueAssignmentsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(messageQueueAssignments_);
      } else {
        return messageQueueAssignmentsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .rocketmq.rpc.api.MessageQueueAssignment message_queue_assignments = 3;</code>
     */
    public int getMessageQueueAssignmentsCount() {
      if (messageQueueAssignmentsBuilder_ == null) {
        return messageQueueAssignments_.size();
      } else {
        return messageQueueAssignmentsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .rocketmq.rpc.api.MessageQueueAssignment message_queue_assignments = 3;</code>
     */
    public org.apache.rocketmq.proto.MessageQueueAssignment getMessageQueueAssignments(int index) {
      if (messageQueueAssignmentsBuilder_ == null) {
        return messageQueueAssignments_.get(index);
      } else {
        return messageQueueAssignmentsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .rocketmq.rpc.api.MessageQueueAssignment message_queue_assignments = 3;</code>
     */
    public Builder setMessageQueueAssignments(
        int index, org.apache.rocketmq.proto.MessageQueueAssignment value) {
      if (messageQueueAssignmentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMessageQueueAssignmentsIsMutable();
        messageQueueAssignments_.set(index, value);
        onChanged();
      } else {
        messageQueueAssignmentsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .rocketmq.rpc.api.MessageQueueAssignment message_queue_assignments = 3;</code>
     */
    public Builder setMessageQueueAssignments(
        int index, org.apache.rocketmq.proto.MessageQueueAssignment.Builder builderForValue) {
      if (messageQueueAssignmentsBuilder_ == null) {
        ensureMessageQueueAssignmentsIsMutable();
        messageQueueAssignments_.set(index, builderForValue.build());
        onChanged();
      } else {
        messageQueueAssignmentsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .rocketmq.rpc.api.MessageQueueAssignment message_queue_assignments = 3;</code>
     */
    public Builder addMessageQueueAssignments(org.apache.rocketmq.proto.MessageQueueAssignment value) {
      if (messageQueueAssignmentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMessageQueueAssignmentsIsMutable();
        messageQueueAssignments_.add(value);
        onChanged();
      } else {
        messageQueueAssignmentsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .rocketmq.rpc.api.MessageQueueAssignment message_queue_assignments = 3;</code>
     */
    public Builder addMessageQueueAssignments(
        int index, org.apache.rocketmq.proto.MessageQueueAssignment value) {
      if (messageQueueAssignmentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMessageQueueAssignmentsIsMutable();
        messageQueueAssignments_.add(index, value);
        onChanged();
      } else {
        messageQueueAssignmentsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .rocketmq.rpc.api.MessageQueueAssignment message_queue_assignments = 3;</code>
     */
    public Builder addMessageQueueAssignments(
        org.apache.rocketmq.proto.MessageQueueAssignment.Builder builderForValue) {
      if (messageQueueAssignmentsBuilder_ == null) {
        ensureMessageQueueAssignmentsIsMutable();
        messageQueueAssignments_.add(builderForValue.build());
        onChanged();
      } else {
        messageQueueAssignmentsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .rocketmq.rpc.api.MessageQueueAssignment message_queue_assignments = 3;</code>
     */
    public Builder addMessageQueueAssignments(
        int index, org.apache.rocketmq.proto.MessageQueueAssignment.Builder builderForValue) {
      if (messageQueueAssignmentsBuilder_ == null) {
        ensureMessageQueueAssignmentsIsMutable();
        messageQueueAssignments_.add(index, builderForValue.build());
        onChanged();
      } else {
        messageQueueAssignmentsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .rocketmq.rpc.api.MessageQueueAssignment message_queue_assignments = 3;</code>
     */
    public Builder addAllMessageQueueAssignments(
        java.lang.Iterable<? extends org.apache.rocketmq.proto.MessageQueueAssignment> values) {
      if (messageQueueAssignmentsBuilder_ == null) {
        ensureMessageQueueAssignmentsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, messageQueueAssignments_);
        onChanged();
      } else {
        messageQueueAssignmentsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .rocketmq.rpc.api.MessageQueueAssignment message_queue_assignments = 3;</code>
     */
    public Builder clearMessageQueueAssignments() {
      if (messageQueueAssignmentsBuilder_ == null) {
        messageQueueAssignments_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
      } else {
        messageQueueAssignmentsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .rocketmq.rpc.api.MessageQueueAssignment message_queue_assignments = 3;</code>
     */
    public Builder removeMessageQueueAssignments(int index) {
      if (messageQueueAssignmentsBuilder_ == null) {
        ensureMessageQueueAssignmentsIsMutable();
        messageQueueAssignments_.remove(index);
        onChanged();
      } else {
        messageQueueAssignmentsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .rocketmq.rpc.api.MessageQueueAssignment message_queue_assignments = 3;</code>
     */
    public org.apache.rocketmq.proto.MessageQueueAssignment.Builder getMessageQueueAssignmentsBuilder(
        int index) {
      return getMessageQueueAssignmentsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .rocketmq.rpc.api.MessageQueueAssignment message_queue_assignments = 3;</code>
     */
    public org.apache.rocketmq.proto.MessageQueueAssignmentOrBuilder getMessageQueueAssignmentsOrBuilder(
        int index) {
      if (messageQueueAssignmentsBuilder_ == null) {
        return messageQueueAssignments_.get(index);  } else {
        return messageQueueAssignmentsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .rocketmq.rpc.api.MessageQueueAssignment message_queue_assignments = 3;</code>
     */
    public java.util.List<? extends org.apache.rocketmq.proto.MessageQueueAssignmentOrBuilder> 
         getMessageQueueAssignmentsOrBuilderList() {
      if (messageQueueAssignmentsBuilder_ != null) {
        return messageQueueAssignmentsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(messageQueueAssignments_);
      }
    }
    /**
     * <code>repeated .rocketmq.rpc.api.MessageQueueAssignment message_queue_assignments = 3;</code>
     */
    public org.apache.rocketmq.proto.MessageQueueAssignment.Builder addMessageQueueAssignmentsBuilder() {
      return getMessageQueueAssignmentsFieldBuilder().addBuilder(
          org.apache.rocketmq.proto.MessageQueueAssignment.getDefaultInstance());
    }
    /**
     * <code>repeated .rocketmq.rpc.api.MessageQueueAssignment message_queue_assignments = 3;</code>
     */
    public org.apache.rocketmq.proto.MessageQueueAssignment.Builder addMessageQueueAssignmentsBuilder(
        int index) {
      return getMessageQueueAssignmentsFieldBuilder().addBuilder(
          index, org.apache.rocketmq.proto.MessageQueueAssignment.getDefaultInstance());
    }
    /**
     * <code>repeated .rocketmq.rpc.api.MessageQueueAssignment message_queue_assignments = 3;</code>
     */
    public java.util.List<org.apache.rocketmq.proto.MessageQueueAssignment.Builder> 
         getMessageQueueAssignmentsBuilderList() {
      return getMessageQueueAssignmentsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.apache.rocketmq.proto.MessageQueueAssignment, org.apache.rocketmq.proto.MessageQueueAssignment.Builder, org.apache.rocketmq.proto.MessageQueueAssignmentOrBuilder> 
        getMessageQueueAssignmentsFieldBuilder() {
      if (messageQueueAssignmentsBuilder_ == null) {
        messageQueueAssignmentsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.apache.rocketmq.proto.MessageQueueAssignment, org.apache.rocketmq.proto.MessageQueueAssignment.Builder, org.apache.rocketmq.proto.MessageQueueAssignmentOrBuilder>(
                messageQueueAssignments_,
                ((bitField0_ & 0x00000004) == 0x00000004),
                getParentForChildren(),
                isClean());
        messageQueueAssignments_ = null;
      }
      return messageQueueAssignmentsBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:rocketmq.rpc.api.QueryAssignmentResponse)
  }

  // @@protoc_insertion_point(class_scope:rocketmq.rpc.api.QueryAssignmentResponse)
  private static final org.apache.rocketmq.proto.QueryAssignmentResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.apache.rocketmq.proto.QueryAssignmentResponse();
  }

  public static org.apache.rocketmq.proto.QueryAssignmentResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryAssignmentResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryAssignmentResponse>() {
    public QueryAssignmentResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new QueryAssignmentResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<QueryAssignmentResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryAssignmentResponse> getParserForType() {
    return PARSER;
  }

  public org.apache.rocketmq.proto.QueryAssignmentResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

