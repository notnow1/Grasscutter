// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FishPoolInfo.proto

package emu.grasscutter.net.proto;

public final class FishPoolInfoOuterClass {
  private FishPoolInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FishPoolInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FishPoolInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 pool_id = 1;</code>
     * @return The poolId.
     */
    int getPoolId();

    /**
     * <code>repeated uint32 fish_area_list = 2;</code>
     * @return A list containing the fishAreaList.
     */
    java.util.List<java.lang.Integer> getFishAreaListList();
    /**
     * <code>repeated uint32 fish_area_list = 2;</code>
     * @return The count of fishAreaList.
     */
    int getFishAreaListCount();
    /**
     * <code>repeated uint32 fish_area_list = 2;</code>
     * @param index The index of the element to return.
     * @return The fishAreaList at the given index.
     */
    int getFishAreaList(int index);

    /**
     * <code>uint32 today_fish_num = 3;</code>
     * @return The todayFishNum.
     */
    int getTodayFishNum();
  }
  /**
   * Protobuf type {@code FishPoolInfo}
   */
  public static final class FishPoolInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FishPoolInfo)
      FishPoolInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FishPoolInfo.newBuilder() to construct.
    private FishPoolInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FishPoolInfo() {
      fishAreaList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FishPoolInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private FishPoolInfo(
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
            case 8: {

              poolId_ = input.readUInt32();
              break;
            }
            case 16: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                fishAreaList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              fishAreaList_.addInt(input.readUInt32());
              break;
            }
            case 18: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                fishAreaList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                fishAreaList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 24: {

              todayFishNum_ = input.readUInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          fishAreaList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.FishPoolInfoOuterClass.internal_static_FishPoolInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.FishPoolInfoOuterClass.internal_static_FishPoolInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.FishPoolInfoOuterClass.FishPoolInfo.class, emu.grasscutter.net.proto.FishPoolInfoOuterClass.FishPoolInfo.Builder.class);
    }

    public static final int POOL_ID_FIELD_NUMBER = 1;
    private int poolId_;
    /**
     * <code>uint32 pool_id = 1;</code>
     * @return The poolId.
     */
    @java.lang.Override
    public int getPoolId() {
      return poolId_;
    }

    public static final int FISH_AREA_LIST_FIELD_NUMBER = 2;
    private com.google.protobuf.Internal.IntList fishAreaList_;
    /**
     * <code>repeated uint32 fish_area_list = 2;</code>
     * @return A list containing the fishAreaList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getFishAreaListList() {
      return fishAreaList_;
    }
    /**
     * <code>repeated uint32 fish_area_list = 2;</code>
     * @return The count of fishAreaList.
     */
    public int getFishAreaListCount() {
      return fishAreaList_.size();
    }
    /**
     * <code>repeated uint32 fish_area_list = 2;</code>
     * @param index The index of the element to return.
     * @return The fishAreaList at the given index.
     */
    public int getFishAreaList(int index) {
      return fishAreaList_.getInt(index);
    }
    private int fishAreaListMemoizedSerializedSize = -1;

    public static final int TODAY_FISH_NUM_FIELD_NUMBER = 3;
    private int todayFishNum_;
    /**
     * <code>uint32 today_fish_num = 3;</code>
     * @return The todayFishNum.
     */
    @java.lang.Override
    public int getTodayFishNum() {
      return todayFishNum_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (poolId_ != 0) {
        output.writeUInt32(1, poolId_);
      }
      if (getFishAreaListList().size() > 0) {
        output.writeUInt32NoTag(18);
        output.writeUInt32NoTag(fishAreaListMemoizedSerializedSize);
      }
      for (int i = 0; i < fishAreaList_.size(); i++) {
        output.writeUInt32NoTag(fishAreaList_.getInt(i));
      }
      if (todayFishNum_ != 0) {
        output.writeUInt32(3, todayFishNum_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (poolId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, poolId_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < fishAreaList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(fishAreaList_.getInt(i));
        }
        size += dataSize;
        if (!getFishAreaListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        fishAreaListMemoizedSerializedSize = dataSize;
      }
      if (todayFishNum_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, todayFishNum_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.FishPoolInfoOuterClass.FishPoolInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.FishPoolInfoOuterClass.FishPoolInfo other = (emu.grasscutter.net.proto.FishPoolInfoOuterClass.FishPoolInfo) obj;

      if (getPoolId()
          != other.getPoolId()) return false;
      if (!getFishAreaListList()
          .equals(other.getFishAreaListList())) return false;
      if (getTodayFishNum()
          != other.getTodayFishNum()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + POOL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getPoolId();
      if (getFishAreaListCount() > 0) {
        hash = (37 * hash) + FISH_AREA_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getFishAreaListList().hashCode();
      }
      hash = (37 * hash) + TODAY_FISH_NUM_FIELD_NUMBER;
      hash = (53 * hash) + getTodayFishNum();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.FishPoolInfoOuterClass.FishPoolInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FishPoolInfoOuterClass.FishPoolInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FishPoolInfoOuterClass.FishPoolInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FishPoolInfoOuterClass.FishPoolInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FishPoolInfoOuterClass.FishPoolInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FishPoolInfoOuterClass.FishPoolInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FishPoolInfoOuterClass.FishPoolInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FishPoolInfoOuterClass.FishPoolInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FishPoolInfoOuterClass.FishPoolInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FishPoolInfoOuterClass.FishPoolInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FishPoolInfoOuterClass.FishPoolInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FishPoolInfoOuterClass.FishPoolInfo parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.FishPoolInfoOuterClass.FishPoolInfo prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
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
     * Protobuf type {@code FishPoolInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FishPoolInfo)
        emu.grasscutter.net.proto.FishPoolInfoOuterClass.FishPoolInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.FishPoolInfoOuterClass.internal_static_FishPoolInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.FishPoolInfoOuterClass.internal_static_FishPoolInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.FishPoolInfoOuterClass.FishPoolInfo.class, emu.grasscutter.net.proto.FishPoolInfoOuterClass.FishPoolInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.FishPoolInfoOuterClass.FishPoolInfo.newBuilder()
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
      @java.lang.Override
      public Builder clear() {
        super.clear();
        poolId_ = 0;

        fishAreaList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        todayFishNum_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.FishPoolInfoOuterClass.internal_static_FishPoolInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FishPoolInfoOuterClass.FishPoolInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.FishPoolInfoOuterClass.FishPoolInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FishPoolInfoOuterClass.FishPoolInfo build() {
        emu.grasscutter.net.proto.FishPoolInfoOuterClass.FishPoolInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FishPoolInfoOuterClass.FishPoolInfo buildPartial() {
        emu.grasscutter.net.proto.FishPoolInfoOuterClass.FishPoolInfo result = new emu.grasscutter.net.proto.FishPoolInfoOuterClass.FishPoolInfo(this);
        int from_bitField0_ = bitField0_;
        result.poolId_ = poolId_;
        if (((bitField0_ & 0x00000001) != 0)) {
          fishAreaList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.fishAreaList_ = fishAreaList_;
        result.todayFishNum_ = todayFishNum_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.FishPoolInfoOuterClass.FishPoolInfo) {
          return mergeFrom((emu.grasscutter.net.proto.FishPoolInfoOuterClass.FishPoolInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.FishPoolInfoOuterClass.FishPoolInfo other) {
        if (other == emu.grasscutter.net.proto.FishPoolInfoOuterClass.FishPoolInfo.getDefaultInstance()) return this;
        if (other.getPoolId() != 0) {
          setPoolId(other.getPoolId());
        }
        if (!other.fishAreaList_.isEmpty()) {
          if (fishAreaList_.isEmpty()) {
            fishAreaList_ = other.fishAreaList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureFishAreaListIsMutable();
            fishAreaList_.addAll(other.fishAreaList_);
          }
          onChanged();
        }
        if (other.getTodayFishNum() != 0) {
          setTodayFishNum(other.getTodayFishNum());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.FishPoolInfoOuterClass.FishPoolInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.FishPoolInfoOuterClass.FishPoolInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int poolId_ ;
      /**
       * <code>uint32 pool_id = 1;</code>
       * @return The poolId.
       */
      @java.lang.Override
      public int getPoolId() {
        return poolId_;
      }
      /**
       * <code>uint32 pool_id = 1;</code>
       * @param value The poolId to set.
       * @return This builder for chaining.
       */
      public Builder setPoolId(int value) {
        
        poolId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 pool_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearPoolId() {
        
        poolId_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList fishAreaList_ = emptyIntList();
      private void ensureFishAreaListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          fishAreaList_ = mutableCopy(fishAreaList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 fish_area_list = 2;</code>
       * @return A list containing the fishAreaList.
       */
      public java.util.List<java.lang.Integer>
          getFishAreaListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(fishAreaList_) : fishAreaList_;
      }
      /**
       * <code>repeated uint32 fish_area_list = 2;</code>
       * @return The count of fishAreaList.
       */
      public int getFishAreaListCount() {
        return fishAreaList_.size();
      }
      /**
       * <code>repeated uint32 fish_area_list = 2;</code>
       * @param index The index of the element to return.
       * @return The fishAreaList at the given index.
       */
      public int getFishAreaList(int index) {
        return fishAreaList_.getInt(index);
      }
      /**
       * <code>repeated uint32 fish_area_list = 2;</code>
       * @param index The index to set the value at.
       * @param value The fishAreaList to set.
       * @return This builder for chaining.
       */
      public Builder setFishAreaList(
          int index, int value) {
        ensureFishAreaListIsMutable();
        fishAreaList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 fish_area_list = 2;</code>
       * @param value The fishAreaList to add.
       * @return This builder for chaining.
       */
      public Builder addFishAreaList(int value) {
        ensureFishAreaListIsMutable();
        fishAreaList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 fish_area_list = 2;</code>
       * @param values The fishAreaList to add.
       * @return This builder for chaining.
       */
      public Builder addAllFishAreaList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureFishAreaListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, fishAreaList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 fish_area_list = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearFishAreaList() {
        fishAreaList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int todayFishNum_ ;
      /**
       * <code>uint32 today_fish_num = 3;</code>
       * @return The todayFishNum.
       */
      @java.lang.Override
      public int getTodayFishNum() {
        return todayFishNum_;
      }
      /**
       * <code>uint32 today_fish_num = 3;</code>
       * @param value The todayFishNum to set.
       * @return This builder for chaining.
       */
      public Builder setTodayFishNum(int value) {
        
        todayFishNum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 today_fish_num = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearTodayFishNum() {
        
        todayFishNum_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:FishPoolInfo)
    }

    // @@protoc_insertion_point(class_scope:FishPoolInfo)
    private static final emu.grasscutter.net.proto.FishPoolInfoOuterClass.FishPoolInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.FishPoolInfoOuterClass.FishPoolInfo();
    }

    public static emu.grasscutter.net.proto.FishPoolInfoOuterClass.FishPoolInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FishPoolInfo>
        PARSER = new com.google.protobuf.AbstractParser<FishPoolInfo>() {
      @java.lang.Override
      public FishPoolInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new FishPoolInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<FishPoolInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FishPoolInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.FishPoolInfoOuterClass.FishPoolInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FishPoolInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FishPoolInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022FishPoolInfo.proto\"O\n\014FishPoolInfo\022\017\n\007" +
      "pool_id\030\001 \001(\r\022\026\n\016fish_area_list\030\002 \003(\r\022\026\n" +
      "\016today_fish_num\030\003 \001(\rB\033\n\031emu.grasscutter" +
      ".net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_FishPoolInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FishPoolInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FishPoolInfo_descriptor,
        new java.lang.String[] { "PoolId", "FishAreaList", "TodayFishNum", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
