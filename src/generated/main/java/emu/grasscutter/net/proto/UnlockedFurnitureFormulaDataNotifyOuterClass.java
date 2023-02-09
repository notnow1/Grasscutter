// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: UnlockedFurnitureFormulaDataNotify.proto

package emu.grasscutter.net.proto;

public final class UnlockedFurnitureFormulaDataNotifyOuterClass {
  private UnlockedFurnitureFormulaDataNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface UnlockedFurnitureFormulaDataNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:UnlockedFurnitureFormulaDataNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_all = 4;</code>
     * @return The isAll.
     */
    boolean getIsAll();

    /**
     * <code>repeated uint32 furniture_id_list = 2;</code>
     * @return A list containing the furnitureIdList.
     */
    java.util.List<java.lang.Integer> getFurnitureIdListList();
    /**
     * <code>repeated uint32 furniture_id_list = 2;</code>
     * @return The count of furnitureIdList.
     */
    int getFurnitureIdListCount();
    /**
     * <code>repeated uint32 furniture_id_list = 2;</code>
     * @param index The index of the element to return.
     * @return The furnitureIdList at the given index.
     */
    int getFurnitureIdList(int index);
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 4716;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code UnlockedFurnitureFormulaDataNotify}
   */
  public static final class UnlockedFurnitureFormulaDataNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:UnlockedFurnitureFormulaDataNotify)
      UnlockedFurnitureFormulaDataNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use UnlockedFurnitureFormulaDataNotify.newBuilder() to construct.
    private UnlockedFurnitureFormulaDataNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private UnlockedFurnitureFormulaDataNotify() {
      furnitureIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new UnlockedFurnitureFormulaDataNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private UnlockedFurnitureFormulaDataNotify(
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
            case 16: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                furnitureIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              furnitureIdList_.addInt(input.readUInt32());
              break;
            }
            case 18: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                furnitureIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                furnitureIdList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 32: {

              isAll_ = input.readBool();
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
          furnitureIdList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.UnlockedFurnitureFormulaDataNotifyOuterClass.internal_static_UnlockedFurnitureFormulaDataNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.UnlockedFurnitureFormulaDataNotifyOuterClass.internal_static_UnlockedFurnitureFormulaDataNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.UnlockedFurnitureFormulaDataNotifyOuterClass.UnlockedFurnitureFormulaDataNotify.class, emu.grasscutter.net.proto.UnlockedFurnitureFormulaDataNotifyOuterClass.UnlockedFurnitureFormulaDataNotify.Builder.class);
    }

    public static final int IS_ALL_FIELD_NUMBER = 4;
    private boolean isAll_;
    /**
     * <code>bool is_all = 4;</code>
     * @return The isAll.
     */
    @java.lang.Override
    public boolean getIsAll() {
      return isAll_;
    }

    public static final int FURNITURE_ID_LIST_FIELD_NUMBER = 2;
    private com.google.protobuf.Internal.IntList furnitureIdList_;
    /**
     * <code>repeated uint32 furniture_id_list = 2;</code>
     * @return A list containing the furnitureIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getFurnitureIdListList() {
      return furnitureIdList_;
    }
    /**
     * <code>repeated uint32 furniture_id_list = 2;</code>
     * @return The count of furnitureIdList.
     */
    public int getFurnitureIdListCount() {
      return furnitureIdList_.size();
    }
    /**
     * <code>repeated uint32 furniture_id_list = 2;</code>
     * @param index The index of the element to return.
     * @return The furnitureIdList at the given index.
     */
    public int getFurnitureIdList(int index) {
      return furnitureIdList_.getInt(index);
    }
    private int furnitureIdListMemoizedSerializedSize = -1;

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
      if (getFurnitureIdListList().size() > 0) {
        output.writeUInt32NoTag(18);
        output.writeUInt32NoTag(furnitureIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < furnitureIdList_.size(); i++) {
        output.writeUInt32NoTag(furnitureIdList_.getInt(i));
      }
      if (isAll_ != false) {
        output.writeBool(4, isAll_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < furnitureIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(furnitureIdList_.getInt(i));
        }
        size += dataSize;
        if (!getFurnitureIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        furnitureIdListMemoizedSerializedSize = dataSize;
      }
      if (isAll_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(4, isAll_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.UnlockedFurnitureFormulaDataNotifyOuterClass.UnlockedFurnitureFormulaDataNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.UnlockedFurnitureFormulaDataNotifyOuterClass.UnlockedFurnitureFormulaDataNotify other = (emu.grasscutter.net.proto.UnlockedFurnitureFormulaDataNotifyOuterClass.UnlockedFurnitureFormulaDataNotify) obj;

      if (getIsAll()
          != other.getIsAll()) return false;
      if (!getFurnitureIdListList()
          .equals(other.getFurnitureIdListList())) return false;
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
      hash = (37 * hash) + IS_ALL_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsAll());
      if (getFurnitureIdListCount() > 0) {
        hash = (37 * hash) + FURNITURE_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getFurnitureIdListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.UnlockedFurnitureFormulaDataNotifyOuterClass.UnlockedFurnitureFormulaDataNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.UnlockedFurnitureFormulaDataNotifyOuterClass.UnlockedFurnitureFormulaDataNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UnlockedFurnitureFormulaDataNotifyOuterClass.UnlockedFurnitureFormulaDataNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.UnlockedFurnitureFormulaDataNotifyOuterClass.UnlockedFurnitureFormulaDataNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UnlockedFurnitureFormulaDataNotifyOuterClass.UnlockedFurnitureFormulaDataNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.UnlockedFurnitureFormulaDataNotifyOuterClass.UnlockedFurnitureFormulaDataNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UnlockedFurnitureFormulaDataNotifyOuterClass.UnlockedFurnitureFormulaDataNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.UnlockedFurnitureFormulaDataNotifyOuterClass.UnlockedFurnitureFormulaDataNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UnlockedFurnitureFormulaDataNotifyOuterClass.UnlockedFurnitureFormulaDataNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.UnlockedFurnitureFormulaDataNotifyOuterClass.UnlockedFurnitureFormulaDataNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UnlockedFurnitureFormulaDataNotifyOuterClass.UnlockedFurnitureFormulaDataNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.UnlockedFurnitureFormulaDataNotifyOuterClass.UnlockedFurnitureFormulaDataNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.UnlockedFurnitureFormulaDataNotifyOuterClass.UnlockedFurnitureFormulaDataNotify prototype) {
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
     * <pre>
     * enum CmdId {
     *   option allow_alias = true;
     *   NONE = 0;
     *   CMD_ID = 4716;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code UnlockedFurnitureFormulaDataNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:UnlockedFurnitureFormulaDataNotify)
        emu.grasscutter.net.proto.UnlockedFurnitureFormulaDataNotifyOuterClass.UnlockedFurnitureFormulaDataNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.UnlockedFurnitureFormulaDataNotifyOuterClass.internal_static_UnlockedFurnitureFormulaDataNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.UnlockedFurnitureFormulaDataNotifyOuterClass.internal_static_UnlockedFurnitureFormulaDataNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.UnlockedFurnitureFormulaDataNotifyOuterClass.UnlockedFurnitureFormulaDataNotify.class, emu.grasscutter.net.proto.UnlockedFurnitureFormulaDataNotifyOuterClass.UnlockedFurnitureFormulaDataNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.UnlockedFurnitureFormulaDataNotifyOuterClass.UnlockedFurnitureFormulaDataNotify.newBuilder()
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
        isAll_ = false;

        furnitureIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.UnlockedFurnitureFormulaDataNotifyOuterClass.internal_static_UnlockedFurnitureFormulaDataNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.UnlockedFurnitureFormulaDataNotifyOuterClass.UnlockedFurnitureFormulaDataNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.UnlockedFurnitureFormulaDataNotifyOuterClass.UnlockedFurnitureFormulaDataNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.UnlockedFurnitureFormulaDataNotifyOuterClass.UnlockedFurnitureFormulaDataNotify build() {
        emu.grasscutter.net.proto.UnlockedFurnitureFormulaDataNotifyOuterClass.UnlockedFurnitureFormulaDataNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.UnlockedFurnitureFormulaDataNotifyOuterClass.UnlockedFurnitureFormulaDataNotify buildPartial() {
        emu.grasscutter.net.proto.UnlockedFurnitureFormulaDataNotifyOuterClass.UnlockedFurnitureFormulaDataNotify result = new emu.grasscutter.net.proto.UnlockedFurnitureFormulaDataNotifyOuterClass.UnlockedFurnitureFormulaDataNotify(this);
        int from_bitField0_ = bitField0_;
        result.isAll_ = isAll_;
        if (((bitField0_ & 0x00000001) != 0)) {
          furnitureIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.furnitureIdList_ = furnitureIdList_;
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
        if (other instanceof emu.grasscutter.net.proto.UnlockedFurnitureFormulaDataNotifyOuterClass.UnlockedFurnitureFormulaDataNotify) {
          return mergeFrom((emu.grasscutter.net.proto.UnlockedFurnitureFormulaDataNotifyOuterClass.UnlockedFurnitureFormulaDataNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.UnlockedFurnitureFormulaDataNotifyOuterClass.UnlockedFurnitureFormulaDataNotify other) {
        if (other == emu.grasscutter.net.proto.UnlockedFurnitureFormulaDataNotifyOuterClass.UnlockedFurnitureFormulaDataNotify.getDefaultInstance()) return this;
        if (other.getIsAll() != false) {
          setIsAll(other.getIsAll());
        }
        if (!other.furnitureIdList_.isEmpty()) {
          if (furnitureIdList_.isEmpty()) {
            furnitureIdList_ = other.furnitureIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureFurnitureIdListIsMutable();
            furnitureIdList_.addAll(other.furnitureIdList_);
          }
          onChanged();
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
        emu.grasscutter.net.proto.UnlockedFurnitureFormulaDataNotifyOuterClass.UnlockedFurnitureFormulaDataNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.UnlockedFurnitureFormulaDataNotifyOuterClass.UnlockedFurnitureFormulaDataNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private boolean isAll_ ;
      /**
       * <code>bool is_all = 4;</code>
       * @return The isAll.
       */
      @java.lang.Override
      public boolean getIsAll() {
        return isAll_;
      }
      /**
       * <code>bool is_all = 4;</code>
       * @param value The isAll to set.
       * @return This builder for chaining.
       */
      public Builder setIsAll(boolean value) {
        
        isAll_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_all = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsAll() {
        
        isAll_ = false;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList furnitureIdList_ = emptyIntList();
      private void ensureFurnitureIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          furnitureIdList_ = mutableCopy(furnitureIdList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 furniture_id_list = 2;</code>
       * @return A list containing the furnitureIdList.
       */
      public java.util.List<java.lang.Integer>
          getFurnitureIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(furnitureIdList_) : furnitureIdList_;
      }
      /**
       * <code>repeated uint32 furniture_id_list = 2;</code>
       * @return The count of furnitureIdList.
       */
      public int getFurnitureIdListCount() {
        return furnitureIdList_.size();
      }
      /**
       * <code>repeated uint32 furniture_id_list = 2;</code>
       * @param index The index of the element to return.
       * @return The furnitureIdList at the given index.
       */
      public int getFurnitureIdList(int index) {
        return furnitureIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 furniture_id_list = 2;</code>
       * @param index The index to set the value at.
       * @param value The furnitureIdList to set.
       * @return This builder for chaining.
       */
      public Builder setFurnitureIdList(
          int index, int value) {
        ensureFurnitureIdListIsMutable();
        furnitureIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 furniture_id_list = 2;</code>
       * @param value The furnitureIdList to add.
       * @return This builder for chaining.
       */
      public Builder addFurnitureIdList(int value) {
        ensureFurnitureIdListIsMutable();
        furnitureIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 furniture_id_list = 2;</code>
       * @param values The furnitureIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllFurnitureIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureFurnitureIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, furnitureIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 furniture_id_list = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearFurnitureIdList() {
        furnitureIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
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


      // @@protoc_insertion_point(builder_scope:UnlockedFurnitureFormulaDataNotify)
    }

    // @@protoc_insertion_point(class_scope:UnlockedFurnitureFormulaDataNotify)
    private static final emu.grasscutter.net.proto.UnlockedFurnitureFormulaDataNotifyOuterClass.UnlockedFurnitureFormulaDataNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.UnlockedFurnitureFormulaDataNotifyOuterClass.UnlockedFurnitureFormulaDataNotify();
    }

    public static emu.grasscutter.net.proto.UnlockedFurnitureFormulaDataNotifyOuterClass.UnlockedFurnitureFormulaDataNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<UnlockedFurnitureFormulaDataNotify>
        PARSER = new com.google.protobuf.AbstractParser<UnlockedFurnitureFormulaDataNotify>() {
      @java.lang.Override
      public UnlockedFurnitureFormulaDataNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new UnlockedFurnitureFormulaDataNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<UnlockedFurnitureFormulaDataNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<UnlockedFurnitureFormulaDataNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.UnlockedFurnitureFormulaDataNotifyOuterClass.UnlockedFurnitureFormulaDataNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UnlockedFurnitureFormulaDataNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UnlockedFurnitureFormulaDataNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n(UnlockedFurnitureFormulaDataNotify.pro" +
      "to\"O\n\"UnlockedFurnitureFormulaDataNotify" +
      "\022\016\n\006is_all\030\004 \001(\010\022\031\n\021furniture_id_list\030\002 " +
      "\003(\rB\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_UnlockedFurnitureFormulaDataNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_UnlockedFurnitureFormulaDataNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UnlockedFurnitureFormulaDataNotify_descriptor,
        new java.lang.String[] { "IsAll", "FurnitureIdList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
