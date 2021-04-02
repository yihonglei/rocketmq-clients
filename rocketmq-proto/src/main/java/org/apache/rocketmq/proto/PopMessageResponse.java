// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rocketmq.proto

package org.apache.rocketmq.proto;

/**
 * Protobuf type {@code rocketmq.rpc.api.PopMessageResponse}
 */
public  final class PopMessageResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:rocketmq.rpc.api.PopMessageResponse)
    PopMessageResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PopMessageResponse.newBuilder() to construct.
  private PopMessageResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PopMessageResponse() {
    code_ = 0;
    remark_ = "";
    popTime_ = 0L;
    invisibleTime_ = 0L;
    reviveQueueId_ = 0;
    restNumber_ = 0L;
    messages_ = java.util.Collections.emptyList();
    termId_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PopMessageResponse(
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
          case 24: {

            popTime_ = input.readInt64();
            break;
          }
          case 32: {

            invisibleTime_ = input.readInt64();
            break;
          }
          case 40: {

            reviveQueueId_ = input.readInt32();
            break;
          }
          case 48: {

            restNumber_ = input.readInt64();
            break;
          }
          case 58: {
            if (!((mutable_bitField0_ & 0x00000040) == 0x00000040)) {
              messages_ = new java.util.ArrayList<org.apache.rocketmq.proto.MessageExt>();
              mutable_bitField0_ |= 0x00000040;
            }
            messages_.add(
                input.readMessage(org.apache.rocketmq.proto.MessageExt.parser(), extensionRegistry));
            break;
          }
          case 64: {

            termId_ = input.readInt64();
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
      if (((mutable_bitField0_ & 0x00000040) == 0x00000040)) {
        messages_ = java.util.Collections.unmodifiableList(messages_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.apache.rocketmq.proto.ACS.internal_static_rocketmq_rpc_api_PopMessageResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.apache.rocketmq.proto.ACS.internal_static_rocketmq_rpc_api_PopMessageResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.apache.rocketmq.proto.PopMessageResponse.class, org.apache.rocketmq.proto.PopMessageResponse.Builder.class);
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

  public static final int POP_TIME_FIELD_NUMBER = 3;
  private long popTime_;
  /**
   * <code>int64 pop_time = 3;</code>
   */
  public long getPopTime() {
    return popTime_;
  }

  public static final int INVISIBLE_TIME_FIELD_NUMBER = 4;
  private long invisibleTime_;
  /**
   * <code>int64 invisible_time = 4;</code>
   */
  public long getInvisibleTime() {
    return invisibleTime_;
  }

  public static final int REVIVE_QUEUE_ID_FIELD_NUMBER = 5;
  private int reviveQueueId_;
  /**
   * <code>int32 revive_queue_id = 5;</code>
   */
  public int getReviveQueueId() {
    return reviveQueueId_;
  }

  public static final int REST_NUMBER_FIELD_NUMBER = 6;
  private long restNumber_;
  /**
   * <code>int64 rest_number = 6;</code>
   */
  public long getRestNumber() {
    return restNumber_;
  }

  public static final int MESSAGES_FIELD_NUMBER = 7;
  private java.util.List<org.apache.rocketmq.proto.MessageExt> messages_;
  /**
   * <code>repeated .rocketmq.rpc.api.MessageExt messages = 7;</code>
   */
  public java.util.List<org.apache.rocketmq.proto.MessageExt> getMessagesList() {
    return messages_;
  }
  /**
   * <code>repeated .rocketmq.rpc.api.MessageExt messages = 7;</code>
   */
  public java.util.List<? extends org.apache.rocketmq.proto.MessageExtOrBuilder> 
      getMessagesOrBuilderList() {
    return messages_;
  }
  /**
   * <code>repeated .rocketmq.rpc.api.MessageExt messages = 7;</code>
   */
  public int getMessagesCount() {
    return messages_.size();
  }
  /**
   * <code>repeated .rocketmq.rpc.api.MessageExt messages = 7;</code>
   */
  public org.apache.rocketmq.proto.MessageExt getMessages(int index) {
    return messages_.get(index);
  }
  /**
   * <code>repeated .rocketmq.rpc.api.MessageExt messages = 7;</code>
   */
  public org.apache.rocketmq.proto.MessageExtOrBuilder getMessagesOrBuilder(
      int index) {
    return messages_.get(index);
  }

  public static final int TERM_ID_FIELD_NUMBER = 8;
  private long termId_;
  /**
   * <code>int64 term_id = 8;</code>
   */
  public long getTermId() {
    return termId_;
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
    if (popTime_ != 0L) {
      output.writeInt64(3, popTime_);
    }
    if (invisibleTime_ != 0L) {
      output.writeInt64(4, invisibleTime_);
    }
    if (reviveQueueId_ != 0) {
      output.writeInt32(5, reviveQueueId_);
    }
    if (restNumber_ != 0L) {
      output.writeInt64(6, restNumber_);
    }
    for (int i = 0; i < messages_.size(); i++) {
      output.writeMessage(7, messages_.get(i));
    }
    if (termId_ != 0L) {
      output.writeInt64(8, termId_);
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
    if (popTime_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, popTime_);
    }
    if (invisibleTime_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, invisibleTime_);
    }
    if (reviveQueueId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, reviveQueueId_);
    }
    if (restNumber_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(6, restNumber_);
    }
    for (int i = 0; i < messages_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(7, messages_.get(i));
    }
    if (termId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(8, termId_);
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
    if (!(obj instanceof org.apache.rocketmq.proto.PopMessageResponse)) {
      return super.equals(obj);
    }
    org.apache.rocketmq.proto.PopMessageResponse other = (org.apache.rocketmq.proto.PopMessageResponse) obj;

    boolean result = true;
    result = result && code_ == other.code_;
    result = result && getRemark()
        .equals(other.getRemark());
    result = result && (getPopTime()
        == other.getPopTime());
    result = result && (getInvisibleTime()
        == other.getInvisibleTime());
    result = result && (getReviveQueueId()
        == other.getReviveQueueId());
    result = result && (getRestNumber()
        == other.getRestNumber());
    result = result && getMessagesList()
        .equals(other.getMessagesList());
    result = result && (getTermId()
        == other.getTermId());
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
    hash = (37 * hash) + POP_TIME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPopTime());
    hash = (37 * hash) + INVISIBLE_TIME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getInvisibleTime());
    hash = (37 * hash) + REVIVE_QUEUE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getReviveQueueId();
    hash = (37 * hash) + REST_NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getRestNumber());
    if (getMessagesCount() > 0) {
      hash = (37 * hash) + MESSAGES_FIELD_NUMBER;
      hash = (53 * hash) + getMessagesList().hashCode();
    }
    hash = (37 * hash) + TERM_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTermId());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.apache.rocketmq.proto.PopMessageResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.rocketmq.proto.PopMessageResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.rocketmq.proto.PopMessageResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.rocketmq.proto.PopMessageResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.rocketmq.proto.PopMessageResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.rocketmq.proto.PopMessageResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.rocketmq.proto.PopMessageResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.rocketmq.proto.PopMessageResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.rocketmq.proto.PopMessageResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.apache.rocketmq.proto.PopMessageResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.rocketmq.proto.PopMessageResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.rocketmq.proto.PopMessageResponse parseFrom(
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
  public static Builder newBuilder(org.apache.rocketmq.proto.PopMessageResponse prototype) {
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
   * Protobuf type {@code rocketmq.rpc.api.PopMessageResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:rocketmq.rpc.api.PopMessageResponse)
      org.apache.rocketmq.proto.PopMessageResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.rocketmq.proto.ACS.internal_static_rocketmq_rpc_api_PopMessageResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.rocketmq.proto.ACS.internal_static_rocketmq_rpc_api_PopMessageResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.rocketmq.proto.PopMessageResponse.class, org.apache.rocketmq.proto.PopMessageResponse.Builder.class);
    }

    // Construct using org.apache.rocketmq.proto.PopMessageResponse.newBuilder()
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
        getMessagesFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      code_ = 0;

      remark_ = "";

      popTime_ = 0L;

      invisibleTime_ = 0L;

      reviveQueueId_ = 0;

      restNumber_ = 0L;

      if (messagesBuilder_ == null) {
        messages_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000040);
      } else {
        messagesBuilder_.clear();
      }
      termId_ = 0L;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.apache.rocketmq.proto.ACS.internal_static_rocketmq_rpc_api_PopMessageResponse_descriptor;
    }

    public org.apache.rocketmq.proto.PopMessageResponse getDefaultInstanceForType() {
      return org.apache.rocketmq.proto.PopMessageResponse.getDefaultInstance();
    }

    public org.apache.rocketmq.proto.PopMessageResponse build() {
      org.apache.rocketmq.proto.PopMessageResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.apache.rocketmq.proto.PopMessageResponse buildPartial() {
      org.apache.rocketmq.proto.PopMessageResponse result = new org.apache.rocketmq.proto.PopMessageResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.code_ = code_;
      result.remark_ = remark_;
      result.popTime_ = popTime_;
      result.invisibleTime_ = invisibleTime_;
      result.reviveQueueId_ = reviveQueueId_;
      result.restNumber_ = restNumber_;
      if (messagesBuilder_ == null) {
        if (((bitField0_ & 0x00000040) == 0x00000040)) {
          messages_ = java.util.Collections.unmodifiableList(messages_);
          bitField0_ = (bitField0_ & ~0x00000040);
        }
        result.messages_ = messages_;
      } else {
        result.messages_ = messagesBuilder_.build();
      }
      result.termId_ = termId_;
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
      if (other instanceof org.apache.rocketmq.proto.PopMessageResponse) {
        return mergeFrom((org.apache.rocketmq.proto.PopMessageResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.apache.rocketmq.proto.PopMessageResponse other) {
      if (other == org.apache.rocketmq.proto.PopMessageResponse.getDefaultInstance()) return this;
      if (other.code_ != 0) {
        setCodeValue(other.getCodeValue());
      }
      if (!other.getRemark().isEmpty()) {
        remark_ = other.remark_;
        onChanged();
      }
      if (other.getPopTime() != 0L) {
        setPopTime(other.getPopTime());
      }
      if (other.getInvisibleTime() != 0L) {
        setInvisibleTime(other.getInvisibleTime());
      }
      if (other.getReviveQueueId() != 0) {
        setReviveQueueId(other.getReviveQueueId());
      }
      if (other.getRestNumber() != 0L) {
        setRestNumber(other.getRestNumber());
      }
      if (messagesBuilder_ == null) {
        if (!other.messages_.isEmpty()) {
          if (messages_.isEmpty()) {
            messages_ = other.messages_;
            bitField0_ = (bitField0_ & ~0x00000040);
          } else {
            ensureMessagesIsMutable();
            messages_.addAll(other.messages_);
          }
          onChanged();
        }
      } else {
        if (!other.messages_.isEmpty()) {
          if (messagesBuilder_.isEmpty()) {
            messagesBuilder_.dispose();
            messagesBuilder_ = null;
            messages_ = other.messages_;
            bitField0_ = (bitField0_ & ~0x00000040);
            messagesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getMessagesFieldBuilder() : null;
          } else {
            messagesBuilder_.addAllMessages(other.messages_);
          }
        }
      }
      if (other.getTermId() != 0L) {
        setTermId(other.getTermId());
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
      org.apache.rocketmq.proto.PopMessageResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.apache.rocketmq.proto.PopMessageResponse) e.getUnfinishedMessage();
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

    private long popTime_ ;
    /**
     * <code>int64 pop_time = 3;</code>
     */
    public long getPopTime() {
      return popTime_;
    }
    /**
     * <code>int64 pop_time = 3;</code>
     */
    public Builder setPopTime(long value) {
      
      popTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 pop_time = 3;</code>
     */
    public Builder clearPopTime() {
      
      popTime_ = 0L;
      onChanged();
      return this;
    }

    private long invisibleTime_ ;
    /**
     * <code>int64 invisible_time = 4;</code>
     */
    public long getInvisibleTime() {
      return invisibleTime_;
    }
    /**
     * <code>int64 invisible_time = 4;</code>
     */
    public Builder setInvisibleTime(long value) {
      
      invisibleTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 invisible_time = 4;</code>
     */
    public Builder clearInvisibleTime() {
      
      invisibleTime_ = 0L;
      onChanged();
      return this;
    }

    private int reviveQueueId_ ;
    /**
     * <code>int32 revive_queue_id = 5;</code>
     */
    public int getReviveQueueId() {
      return reviveQueueId_;
    }
    /**
     * <code>int32 revive_queue_id = 5;</code>
     */
    public Builder setReviveQueueId(int value) {
      
      reviveQueueId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 revive_queue_id = 5;</code>
     */
    public Builder clearReviveQueueId() {
      
      reviveQueueId_ = 0;
      onChanged();
      return this;
    }

    private long restNumber_ ;
    /**
     * <code>int64 rest_number = 6;</code>
     */
    public long getRestNumber() {
      return restNumber_;
    }
    /**
     * <code>int64 rest_number = 6;</code>
     */
    public Builder setRestNumber(long value) {
      
      restNumber_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 rest_number = 6;</code>
     */
    public Builder clearRestNumber() {
      
      restNumber_ = 0L;
      onChanged();
      return this;
    }

    private java.util.List<org.apache.rocketmq.proto.MessageExt> messages_ =
      java.util.Collections.emptyList();
    private void ensureMessagesIsMutable() {
      if (!((bitField0_ & 0x00000040) == 0x00000040)) {
        messages_ = new java.util.ArrayList<org.apache.rocketmq.proto.MessageExt>(messages_);
        bitField0_ |= 0x00000040;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.apache.rocketmq.proto.MessageExt, org.apache.rocketmq.proto.MessageExt.Builder, org.apache.rocketmq.proto.MessageExtOrBuilder> messagesBuilder_;

    /**
     * <code>repeated .rocketmq.rpc.api.MessageExt messages = 7;</code>
     */
    public java.util.List<org.apache.rocketmq.proto.MessageExt> getMessagesList() {
      if (messagesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(messages_);
      } else {
        return messagesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .rocketmq.rpc.api.MessageExt messages = 7;</code>
     */
    public int getMessagesCount() {
      if (messagesBuilder_ == null) {
        return messages_.size();
      } else {
        return messagesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .rocketmq.rpc.api.MessageExt messages = 7;</code>
     */
    public org.apache.rocketmq.proto.MessageExt getMessages(int index) {
      if (messagesBuilder_ == null) {
        return messages_.get(index);
      } else {
        return messagesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .rocketmq.rpc.api.MessageExt messages = 7;</code>
     */
    public Builder setMessages(
        int index, org.apache.rocketmq.proto.MessageExt value) {
      if (messagesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMessagesIsMutable();
        messages_.set(index, value);
        onChanged();
      } else {
        messagesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .rocketmq.rpc.api.MessageExt messages = 7;</code>
     */
    public Builder setMessages(
        int index, org.apache.rocketmq.proto.MessageExt.Builder builderForValue) {
      if (messagesBuilder_ == null) {
        ensureMessagesIsMutable();
        messages_.set(index, builderForValue.build());
        onChanged();
      } else {
        messagesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .rocketmq.rpc.api.MessageExt messages = 7;</code>
     */
    public Builder addMessages(org.apache.rocketmq.proto.MessageExt value) {
      if (messagesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMessagesIsMutable();
        messages_.add(value);
        onChanged();
      } else {
        messagesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .rocketmq.rpc.api.MessageExt messages = 7;</code>
     */
    public Builder addMessages(
        int index, org.apache.rocketmq.proto.MessageExt value) {
      if (messagesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMessagesIsMutable();
        messages_.add(index, value);
        onChanged();
      } else {
        messagesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .rocketmq.rpc.api.MessageExt messages = 7;</code>
     */
    public Builder addMessages(
        org.apache.rocketmq.proto.MessageExt.Builder builderForValue) {
      if (messagesBuilder_ == null) {
        ensureMessagesIsMutable();
        messages_.add(builderForValue.build());
        onChanged();
      } else {
        messagesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .rocketmq.rpc.api.MessageExt messages = 7;</code>
     */
    public Builder addMessages(
        int index, org.apache.rocketmq.proto.MessageExt.Builder builderForValue) {
      if (messagesBuilder_ == null) {
        ensureMessagesIsMutable();
        messages_.add(index, builderForValue.build());
        onChanged();
      } else {
        messagesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .rocketmq.rpc.api.MessageExt messages = 7;</code>
     */
    public Builder addAllMessages(
        java.lang.Iterable<? extends org.apache.rocketmq.proto.MessageExt> values) {
      if (messagesBuilder_ == null) {
        ensureMessagesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, messages_);
        onChanged();
      } else {
        messagesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .rocketmq.rpc.api.MessageExt messages = 7;</code>
     */
    public Builder clearMessages() {
      if (messagesBuilder_ == null) {
        messages_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000040);
        onChanged();
      } else {
        messagesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .rocketmq.rpc.api.MessageExt messages = 7;</code>
     */
    public Builder removeMessages(int index) {
      if (messagesBuilder_ == null) {
        ensureMessagesIsMutable();
        messages_.remove(index);
        onChanged();
      } else {
        messagesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .rocketmq.rpc.api.MessageExt messages = 7;</code>
     */
    public org.apache.rocketmq.proto.MessageExt.Builder getMessagesBuilder(
        int index) {
      return getMessagesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .rocketmq.rpc.api.MessageExt messages = 7;</code>
     */
    public org.apache.rocketmq.proto.MessageExtOrBuilder getMessagesOrBuilder(
        int index) {
      if (messagesBuilder_ == null) {
        return messages_.get(index);  } else {
        return messagesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .rocketmq.rpc.api.MessageExt messages = 7;</code>
     */
    public java.util.List<? extends org.apache.rocketmq.proto.MessageExtOrBuilder> 
         getMessagesOrBuilderList() {
      if (messagesBuilder_ != null) {
        return messagesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(messages_);
      }
    }
    /**
     * <code>repeated .rocketmq.rpc.api.MessageExt messages = 7;</code>
     */
    public org.apache.rocketmq.proto.MessageExt.Builder addMessagesBuilder() {
      return getMessagesFieldBuilder().addBuilder(
          org.apache.rocketmq.proto.MessageExt.getDefaultInstance());
    }
    /**
     * <code>repeated .rocketmq.rpc.api.MessageExt messages = 7;</code>
     */
    public org.apache.rocketmq.proto.MessageExt.Builder addMessagesBuilder(
        int index) {
      return getMessagesFieldBuilder().addBuilder(
          index, org.apache.rocketmq.proto.MessageExt.getDefaultInstance());
    }
    /**
     * <code>repeated .rocketmq.rpc.api.MessageExt messages = 7;</code>
     */
    public java.util.List<org.apache.rocketmq.proto.MessageExt.Builder> 
         getMessagesBuilderList() {
      return getMessagesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.apache.rocketmq.proto.MessageExt, org.apache.rocketmq.proto.MessageExt.Builder, org.apache.rocketmq.proto.MessageExtOrBuilder> 
        getMessagesFieldBuilder() {
      if (messagesBuilder_ == null) {
        messagesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.apache.rocketmq.proto.MessageExt, org.apache.rocketmq.proto.MessageExt.Builder, org.apache.rocketmq.proto.MessageExtOrBuilder>(
                messages_,
                ((bitField0_ & 0x00000040) == 0x00000040),
                getParentForChildren(),
                isClean());
        messages_ = null;
      }
      return messagesBuilder_;
    }

    private long termId_ ;
    /**
     * <code>int64 term_id = 8;</code>
     */
    public long getTermId() {
      return termId_;
    }
    /**
     * <code>int64 term_id = 8;</code>
     */
    public Builder setTermId(long value) {
      
      termId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 term_id = 8;</code>
     */
    public Builder clearTermId() {
      
      termId_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:rocketmq.rpc.api.PopMessageResponse)
  }

  // @@protoc_insertion_point(class_scope:rocketmq.rpc.api.PopMessageResponse)
  private static final org.apache.rocketmq.proto.PopMessageResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.apache.rocketmq.proto.PopMessageResponse();
  }

  public static org.apache.rocketmq.proto.PopMessageResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PopMessageResponse>
      PARSER = new com.google.protobuf.AbstractParser<PopMessageResponse>() {
    public PopMessageResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PopMessageResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PopMessageResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PopMessageResponse> getParserForType() {
    return PARSER;
  }

  public org.apache.rocketmq.proto.PopMessageResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

